public boolean handleCommand(java.util.Scanner lineScanner) {
    try {
        promptForCommand();
        doOneCommand(lineScanner);
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println("oh???");
        java.lang.System.out.println("ERROR: Exception during command processing. Check log for details.");
        codeu.chat.client.commandline.Chat.LOG.error(ex, "Exception during command processing");
    }
    return alive;
}