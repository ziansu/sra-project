@java.lang.Override
public void sendMessage(bots.messages.BotTextMessage msg, java.lang.String channelTo) {
    java.lang.String[] messagesWithoutNewline = bots.IrcBot.COMPILE.split(msg.getText());
    for (java.lang.String messageToken : messagesWithoutNewline) {
        this.client.sendMessage(channelTo, java.lang.String.format("%s/%s/%s: %s", msg.getBotFrom().getClass().getSimpleName(), msg.getChannelFrom(), msg.getNicknameFrom(), messageToken));
    }
}