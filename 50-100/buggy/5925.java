public void sendChatAction(int chatId, com.edoardogiacomello.telegrambot.types.ChatAction action) {
    if ((chatId <= 0) || (action == null))
        throw new java.lang.IllegalArgumentException("You must specify at least a chatId and a valid action");
    
    java.util.List<org.apache.http.NameValuePair> params = new java.util.ArrayList<org.apache.http.NameValuePair>();
    params.add(new org.apache.http.message.BasicNameValuePair("chat_id", java.lang.Integer.toString(chatId)));
    params.add(new org.apache.http.message.BasicNameValuePair("action", action.getValue()));
    outputParser.request(TelegramMethods.sendChatAction, params);
}