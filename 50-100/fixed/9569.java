public int getInt(int min, int max) {
    java.lang.System.out.println("Enter a number: ");
    int userInput = scanner.nextInt();
    scanner.nextLine();
    if ((userInput < min) || (userInput > max)) {
        java.lang.System.out.println("Invalid input");
        userInput = getInt(min, max);
    }
    return userInput;
}