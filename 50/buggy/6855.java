private java.lang.String getCommandFromUser() {
    java.lang.System.out.print("Command: ");
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.String command = scanner.nextLine();
    scanner.close();
    return command;
}