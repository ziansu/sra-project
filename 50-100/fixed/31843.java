public void sendMessages() {
    java.lang.String sessionNumberValue = sessionNumber.getText().toString();
    java.lang.String stringToAdd = inputTextstring.getText().toString();
    java.lang.String authorToAdd = authorText.getText().toString();
    new team.six.androidchat.SendingMessage().execute(sessionNumberValue, stringToAdd, authorToAdd);
}