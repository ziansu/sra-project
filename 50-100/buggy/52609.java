public static void convertUppercaseToLowercase(final java.util.Scanner scanner) {
    java.lang.System.out.println(("This program will ask you to enter a string, and then" + " it will convert all the uppercase letters to lowercase letters"));
    java.lang.System.out.println("Please enter a string: ");
    java.lang.String input;
    input = scanner.nextLine();
    java.lang.System.out.println(("The lowercase version of the string: " + (input.toLowerCase())));
    java.lang.System.out.println("");
}