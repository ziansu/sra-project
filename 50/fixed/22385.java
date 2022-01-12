public void message(java.lang.String target, java.lang.String message) {
    sendRaw(((("PRIVMSG " + target) + " :") + message));
}