@java.lang.Override
void onNotice(java.lang.String nick, java.lang.String from, java.lang.String text) {
    if ((this) != (irc)) {
        return ;
    }
    listener.onNotice(text);
}