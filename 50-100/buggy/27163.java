private void dispatchIncomingCall(java.lang.String userId) {
    showToast(("Call from: " + userId));
    android.util.Log.wtf(TAG, ("userId: " + userId));
    android.content.Intent intent = new android.content.Intent(this, fi.vtt.nubotest.IncomingCallActivity.class);
    intent.putExtra(Constants.USER_NAME, username);
    intent.putExtra(Constants.CALL_USER, userId);
    startActivity(intent);
}