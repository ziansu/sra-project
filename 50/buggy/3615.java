@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.String... strings) {
    return provider.sendMessage(receiver, chatText.getText().toString());
}