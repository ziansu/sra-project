public static void convertCelsiusToFahrenheit() {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println(("This program will ask you for a temperature in " + "Celsius and then convert it to Fahrenheit"));
    java.lang.System.out.println("Enter a temperature in Celsius: ");
    double celsiusDegrees = scanner.nextDouble();
    double fahrenheitDegrees;
    fahrenheitDegrees = ((celsiusDegrees * 9) / 5) + 32;
    java.lang.System.out.println(("The temperature in Fahrenheit is: " + fahrenheitDegrees));
    java.lang.System.out.println("");
}