public static void continueMenu() throws java.io.IOException {
    java.lang.System.out.println("Would you like to do something else?");
    java.lang.String entry = io.File_IO.in.nextLine();
    if ((entry.equalsIgnoreCase("y")) || (entry.equalsIgnoreCase("yes"))) {
        io.File_IO.printMenu();
    }
    io.File_IO.exitProgram();
}