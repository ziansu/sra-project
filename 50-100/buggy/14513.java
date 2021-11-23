public java.lang.String ChangeSystemRestrictions() {
    java.lang.String result = "";
    java.lang.String command;
    result = ProcessInput("HELP");
    java.lang.System.out.println((result + "\n"));
    do {
        java.lang.System.out.printf("Enter a Command >");
        command = CommandLine.myScanner.nextLine();
        result = SystemChangesHelper(command);
        java.lang.System.out.println((result + "\n"));
    } while (!((command.equalsIgnoreCase("QUIT")) || (command.equalsIgnoreCase("Q"))) );
    return result;
}