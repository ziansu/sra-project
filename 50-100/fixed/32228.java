public void onSMSSendError(java.lang.String token, java.lang.String errorDetails) {
    com.nyaruka.androidrelay.data.TextMessage msg = null;
    com.nyaruka.androidrelay.data.TextMessageHelper helper = getHelper();
    msg = helper.withId(java.lang.Long.parseLong(token));
    msg.status = com.nyaruka.androidrelay.data.TextMessage.ERRORED;
    msg.error = "SMS send error";
    helper.updateMessage(msg);
    android.util.Log.d(com.nyaruka.androidrelay.RelayService.TAG, ((("=== SMS ERROR:" + token) + " Details: ") + errorDetails));
    com.nyaruka.androidrelay.MainActivity.updateMessage(msg);
}