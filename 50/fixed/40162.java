public int humanOrAI() {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Do you want to play against another person or the computer?");
    java.lang.System.out.println("Enter 1 for person or 2 for AI");
    int userInput = scanner.nextInt();
    return userInput;
}