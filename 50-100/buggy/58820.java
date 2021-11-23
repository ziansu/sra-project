public void sendMessage(com.nyaruka.androidrelay.data.TextMessage msg) {
    android.util.Log.d(com.nyaruka.androidrelay.RelayService.TAG, ((("=== SMS OUT: " + (msg.number)) + ": ") + (msg.text)));
    try {
        modem.sendSms(msg.number, msg.text, ("" + (msg.id)));
    } catch (java.lang.Exception e) {
        msg.status = com.nyaruka.androidrelay.data.TextMessage.ERRORED;
    }
    com.nyaruka.androidrelay.MainActivity.getMessageList().updateMessage(msg);
}