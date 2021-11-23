private void sendMessage(edu.ucla.cs.chronochat.ChronoChatMessage message) {
    messageListAdapter.add(message);
    android.content.Intent intent = new android.content.Intent(this, edu.ucla.cs.chronochat.ChronoChatService.class);
    intent.setAction(ChronoChatService.ACTION_SEND).putExtra(ChronoChatService.EXTRA_MESSAGE, message.toByteArray()).putExtra(ChronoChatService.EXTRA_PREFIX, prefix);
    startService(intent);
}