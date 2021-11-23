private void wallops(com.adam4.irc.ParsedMessage parsed) {
    com.adam4.spacenet.SpaceNetServer.wallops(userName, parsed.trailing);
}