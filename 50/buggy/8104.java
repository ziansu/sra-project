private static double getDoubleInput(java.util.Scanner input) {
    try {
        return input.nextDouble();
    } catch (java.util.InputMismatchException e) {
        java.lang.System.out.println("Invalid input. Please enter a double.");
        input.next();
        return ZeroBank.getDoubleInput(input);
    }
}