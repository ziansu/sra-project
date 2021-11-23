public void requeueErroredIncoming() {
    com.nyaruka.androidrelay.data.TextMessageHelper helper = getHelper();
    java.util.List<com.nyaruka.androidrelay.data.TextMessage> msgs = helper.withStatus(this.getApplicationContext(), TextMessage.INCOMING, TextMessage.ERRORED);
    int count = 0;
    for (com.nyaruka.androidrelay.data.TextMessage msg : msgs) {
        msg.status = com.nyaruka.androidrelay.data.TextMessage.RECEIVED;
        helper.updateMessage(msg);
        com.nyaruka.androidrelay.MainActivity.getMessageList().updateMessage(msg);
        count++;
        if (count >= 5) {
            android.util.Log.d(com.nyaruka.androidrelay.RelayService.TAG, "Reprocessed five messages, skipping rest.");
            break;
        }
    }
}