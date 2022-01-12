public double getDouble(double min, double max) {
    java.lang.System.out.println("Enter a number: ");
    double userInput = scanner.nextInt();
    if ((userInput < min) || (userInput > max)) {
        java.lang.System.out.println("Invalid input");
        userInput = getDouble(min, max);
    }
    return userInput;
}