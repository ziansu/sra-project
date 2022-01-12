public void showUsage() {
    java.lang.System.out.println(usage);
    java.lang.System.out.println("Available Commands:");
    for (cs455.overlay.util.InteractiveCommandParser.Command com : commands) {
        java.lang.System.out.println(("\t" + com));
    }
}