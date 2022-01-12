public void sendMessage(java.lang.String message) {
    if ((message.length()) > 500) {
        cw.warn("消息字数不要多于500");
        return ;
    }
    com.ctrip.implus.ChatCommand sendCommand = new com.ctrip.implus.ChatCommand(com.ctrip.implus.ChatCommand.SEND, this.from, message);
    cs.send(sendCommand);
}