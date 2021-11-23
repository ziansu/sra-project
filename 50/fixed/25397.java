@java.lang.Override
public void sentTextToChannel(java.lang.String channel, java.lang.String message) {
    sendText(((("PRIVMSG " + channel) + " :") + message));
    guiConnection.writeString(getCurrentUser().getName(), message);
}