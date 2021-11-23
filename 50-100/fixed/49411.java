private void quit(com.adam4.irc.ParsedMessage parsed) {
    status = com.adam4.irc.Client.Status.QUIT;
    sendIRCMessage(new com.adam4.irc.ParsedMessage("ERROR", ("Quit: " + (parsed.trailing))));
    try {
        s.close();
    } catch (java.io.IOException e) {
        Common.log.logMessage(e, LogLevel.WARN);
    } finally {
        privilegeLevel = 0;
    }
}