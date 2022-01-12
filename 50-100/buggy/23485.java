public void promoteErroredMessages() {
    com.nyaruka.androidrelay.data.TextMessageHelper helper = getHelper();
    java.util.List<com.nyaruka.androidrelay.data.TextMessage> msgs = helper.withStatus(this.getApplicationContext(), TextMessage.OUTGOING, TextMessage.QUEUED);
    for (com.nyaruka.androidrelay.data.TextMessage msg : msgs) {
        msg.status = com.nyaruka.androidrelay.data.TextMessage.ERRORED;
        helper.updateMessage(msg);
        com.nyaruka.androidrelay.MainActivity.getMessageList().updateMessage(msg);
    }
}