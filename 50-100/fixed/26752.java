private void handleReceivedMessage(android.content.Intent intent) {
    byte[] encodedMessage = intent.getByteArrayExtra(ChronoChatService.EXTRA_MESSAGE);
    edu.ucla.cs.chronochat.ChronoChatMessage message = new edu.ucla.cs.chronochat.ChronoChatMessage(encodedMessage);
    android.util.Log.d(edu.ucla.cs.chronochat.MainActivity.TAG, ("received message from " + (message.getFrom())));
    showNotification(message);
    messageListAdapter.add(message);
}