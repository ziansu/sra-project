private void quit(com.adam4.irc.ParsedMessage parsed) {
    status = com.adam4.irc.Client.Status.QUIT;
    com.adam4.spacenet.SpaceNetServer.statusChange(this, parsed.trailing);
    com.adam4.spacenet.SpaceNetServer.disconnect(this);
    sendIRCMessage(new com.adam4.irc.ParsedMessage("ERROR", ("Quit: " + (parsed.trailing))));
    try {
        s.close();
    } catch (java.io.IOException e) {
        Common.log.logMessage(e, LogLevel.WARN);
    } finally {
        privilegeLevel = 0;
    }
}