public void onSMSSent(java.lang.String token) {
    com.nyaruka.androidrelay.data.TextMessage msg = null;
    com.nyaruka.androidrelay.data.TextMessageHelper helper = getHelper();
    msg = helper.withId(java.lang.Long.parseLong(token));
    msg.status = com.nyaruka.androidrelay.data.TextMessage.SENT;
    msg.error = "";
    helper.updateMessage(msg);
    android.util.Log.d(com.nyaruka.androidrelay.RelayService.TAG, ("=== SMS SENT: " + token));
    com.nyaruka.androidrelay.MainActivity.getMessageList().updateMessage(msg);
    kickService();
}