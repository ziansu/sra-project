@java.lang.Override
public java.util.Optional<java.lang.String> sendMessage(messages.BotTextMessage msg, java.lang.String channelTo) {
    java.lang.String[] messagesWithoutNewline = bots.IrcBot.COMPILE.split(msg.getText());
    for (java.lang.String messageToken : messagesWithoutNewline) {
        this.client.sendMessage(channelTo, java.lang.String.format("%s/%s/%s: %s", msg.getBotFrom().getId(), msg.getChannelFrom(), msg.getNicknameFrom(), messageToken));
    }
    return java.util.Optional.empty();
}