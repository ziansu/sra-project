public void startUseCase(json.Update update) throws java.io.IOException, org.apache.http.client.ClientProtocolException {
    int chat_id = update.getMessage().getChat().getId();
    java.lang.String reply = "Use case 1 is loading...";
    json.MessageFromBot messageFromBot = new json.MessageFromBot(chat_id, reply, null, null);
    sender.sendMessage(messageFromBot);
}