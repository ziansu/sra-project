public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
    java.lang.String msgToSend = mChatRoomForm.getSendMessage();
    msgToSend = new utils.MessageBuilder().add("event", "send").add("message", msgToSend).build();
    sendMessage(msgToSend);
    incSendMsgNum();
    mChatRoomForm.clearChatArea();
}