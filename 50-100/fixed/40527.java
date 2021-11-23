@java.lang.Override
public void onMessage(java.lang.String event, com.tylerjroach.eventsource.MessageEvent message) {
    try {
        java.util.List<co.getchannel.channel.responses.CHMessageResponse> messages = new java.util.ArrayList<co.getchannel.channel.responses.CHMessageResponse>();
        co.getchannel.channel.responses.CHMessageResponse msg = new com.google.gson.Gson().fromJson(message.data, co.getchannel.channel.responses.CHMessageResponse.class);
        messages.add(msg);
        showMessages(messages);
    } catch (java.lang.Exception e) {
    }
}