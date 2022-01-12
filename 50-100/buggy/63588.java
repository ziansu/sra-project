public void dispatchCall(final java.lang.String callNum) {
    android.util.Log.wtf(TAG, ("dispatchCall: " + callNum));
    android.content.Intent intent = new android.content.Intent(this, fi.vtt.nubotest.PeerVideoActivity.class);
    intent.putExtra(Constants.USER_NAME, username);
    intent.putExtra(Constants.CALL_USER, callNum);
    startActivity(intent);
}