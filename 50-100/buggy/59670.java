@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String textMessage = intent.getExtras().getString("sms");
    java.lang.String message = textMessage.substring(((textMessage.indexOf(':')) + 2));
    java.lang.String number = textMessage.substring(0, textMessage.indexOf(':'));
    messageDatabase.addMessage(new com.example.guy.smsclassproject.MessageObject(message, number, false));
    initializeMessageButtons();
    if (number.equals(currentNumber)) {
        redisplayTexts();
    }
}