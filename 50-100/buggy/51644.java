private void resendMessage(int id) {
    org.linphone.core.LinphoneChatMessage message = getMessageForId(id);
    if (message == null)
        return ;
    
    chatRoom.deleteMessage(getMessageForId(id));
    invalidate();
    if (((message.getText()) != null) && ((message.getText().length()) > 0)) {
        sendTextMessage(message.getText());
    }else {
        sendImageMessage(message.getAppData());
    }
}