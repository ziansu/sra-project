private void version(com.adam4.irc.ParsedMessage parsed) {
    com.adam4.irc.ParsedMessage versionMessage = new com.adam4.irc.ParsedMessage(com.adam4.common.Common.getHostName(), "351", null, ("SpaceNet Server v" + (com.adam4.spacenet.SpaceNetServer.version)));
    sendIRCMessage(versionMessage);
}