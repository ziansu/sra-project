private void sendState(com.example.grand.assignment31.State state) {
    android.content.Intent intent = new android.content.Intent(PlayerActivity.FILTER);
    intent.putExtra(PlayerActivity.PARAM_STATE, state);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
}