public void sendReply(com.adgad.kboard.KCommands commands, java.lang.String key) {
    if (key == "NO_VALUE") {
        return ;
    }
    commands.i(1, key);
    if (mAutoSend) {
        commands.s(1);
    }
}