public java.lang.String getMessagesPlayer() {
    return getData().getString("Messages.Player", getData().getString("Messages.Reward", ""));
}