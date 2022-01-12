@java.lang.Override
public void editMessage(messages.BotTextMessage msg, java.lang.String channelTo, java.lang.String messageId) {
    org.telegram.telegrambots.api.methods.updatingmessages.EditMessageText text = new org.telegram.telegrambots.api.methods.updatingmessages.EditMessageText();
    text.setChatId(channelTo);
    text.setMessageId(java.lang.Integer.parseInt(messageId));
    text.setText(msg.getText());
    try {
        this.editMessageText(text);
    } catch (org.telegram.telegrambots.exceptions.TelegramApiException e) {
        java.lang.System.err.println("Impossibile to edit telegram message.");
        e.printStackTrace();
    }
}