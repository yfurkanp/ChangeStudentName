package Constructors;

import java.beans.Statement;
import java.util.Scanner;

public class Student {
	
	/*
	 * Create a student's variables in the main method and use this assign variables create a method named Changename,
	 * student as parameter get the information and change all the information in the method and add the new information
	 * have it print The line where we call the Rename method in the Main method is immediately then reprint student information
	 * Create a method named changesurname, this method is "lastname" as parameter get the variable. In the method, ask the user to 
	 * enter a new last name and change the old last name (i.e. can).
	 * 
	 */

	static String ogrenciAdi;
	static String ogrenciSoyad�;
	static int    ogrenciYas;
	static int ogrenciNo;
    
	

	public static void main(String[] args) {
		
		
		
		
		Student student = new Student();
	
		student.ogrenciAdi="Furkan";
		student.ogrenciSoyad�="Polat";
		student.ogrenciYas=23;
		student.ogrenciNo=170209024;
		
		System.out.println("Ogrenci Ad� : "+student.ogrenciAdi);
		System.out.println("Ogrenci Soyad� : "+student.ogrenciSoyad�);
		System.out.println("Ogrenci Yas : "+student.ogrenciYas);
		System.out.println("Ogrenci No : "+student.ogrenciNo);
		
		
		
		
		changeName();
		changeUsername();
		bilgileriGetir();
		
	}


	private static void bilgileriGetir() {
		
		Student student = new Student();
		
		System.out.println("Ogrenci Ad� : "+student.ogrenciAdi);
		System.out.println("Ogrenci Soyad� : "+student.ogrenciSoyad�);
		System.out.println("Ogrenci Yas : "+student.ogrenciYas);
		System.out.println("Ogrenci No : "+student.ogrenciNo);
		
	}


	public  static void changeUsername() {
		
		Student student = new Student();
		
		
		if (student.ogrenciSoyad�.equals("Polat")) {
			Scanner scan = new Scanner(System.in);
			System.out.println("L�tfen ��renci Soyad�n� tekrar giriniz : ");
			String str2=scan.next();
			ogrenciSoyad�=str2;
		}
		
	}


	public static   void changeName() {
		
		
		Student student = new Student();
		
		if (student.ogrenciAdi.equals("Furkan")) {
			Scanner scan = new Scanner(System.in);
			System.out.println("L�tfen ��renci ad�n� tekrar giriniz : ");
			String str=scan.next();
			ogrenciAdi=str;
		}
		
	}
	
	

}
