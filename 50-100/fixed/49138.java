public java.lang.String waitForCommand(java.util.List<java.lang.String> commands) {
    java.lang.System.out.print(">> ");
    while (input.hasNextLine()) {
        java.lang.String com = input.nextLine();
        if (commands.contains(com)) {
            return com;
        }else {
            java.lang.System.out.println("No such command. Try ? for help.");
            java.lang.System.out.print(">> ");
        }
    } 
    return null;
}