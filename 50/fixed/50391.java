private void sendRefreshRequest() {
    android.content.Intent serviceIntent = new android.content.Intent(com.scottlindley.mobliezombie.MainActivity.REQUEST_REFRESH_INTENT);
    sendBroadcast(serviceIntent);
}