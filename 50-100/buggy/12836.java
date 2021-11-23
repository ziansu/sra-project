@java.lang.Override
public void notifyOnReceivedMessage(android.telephony.SmsMessage message) {
    java.lang.String messageContent = message.getMessageBody();
    java.lang.String messageFrom = message.getOriginatingAddress();
    java.lang.String messageReciviedTime = java.text.SimpleDateFormat.getInstance().format(new java.util.Date(message.getTimestampMillis()));
    final com.example.michaelssss.myapplication.services.Message message1 = new com.example.michaelssss.myapplication.services.Message(messageReciviedTime, messageFrom, messageContent);
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            urlConnection.sendMessage(com.alibaba.fastjson.JSON.toJSONString(message1));
        }
    }).start();
}