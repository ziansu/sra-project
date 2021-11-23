public static void findLengthOfAString(java.util.Scanner scanner) {
    java.lang.System.out.println(("This program will ask you to enter a string, and then" + " it will tell you the length of that string."));
    java.lang.System.out.println("Please enter a string: ");
    java.lang.String string = scanner.nextLine();
    int length = string.length();
    java.lang.System.out.println(((("The length of the string is: " + length) + "characters") + "."));
}