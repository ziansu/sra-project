@java.lang.Override
public void onIncomingMessage(com.sinch.android.rtc.messaging.MessageClient client, com.sinch.android.rtc.messaging.Message message) {
    android.util.Log.v("onIncomingMessage", ("Message Received from " + (message.getSenderId())));
    com.sinch.android.rtc.messaging.WritableMessage writableMessage = new com.sinch.android.rtc.messaging.WritableMessage(message.getRecipientIds().get(0), message.getTextBody());
    messageAdapter.addMessage(writableMessage, MessageAdapter.DIRECTION_INCOMING);
}