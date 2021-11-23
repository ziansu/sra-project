public void sendMessages() {
    java.lang.String sessionNumberValue = sessionNumber.getText().toString();
    java.lang.String stringToAdd = inputTextstring.getText().toString();
    java.lang.String authorToAdd = input2Textstring.getText().toString();
    new team.six.androidchat.SendingMessage(textView, SendingMessage.ACTION.GET).execute(sessionNumberValue, stringToAdd, authorToAdd);
}