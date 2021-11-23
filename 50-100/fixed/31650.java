public static void main(java.lang.String[] args) {
    java.lang.String city;
    try (java.util.Scanner keyboard = new java.util.Scanner(java.lang.System.in)) {
        java.lang.System.out.println("Enter the name of your city: ");
        city = keyboard.nextLine();
    }
    java.lang.System.out.println(("Number of characters: " + (city.length())));
    java.lang.System.out.println(city.toUpperCase());
    java.lang.System.out.println(city.toLowerCase());
    java.lang.System.out.println(city.charAt(0));
}