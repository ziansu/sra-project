public void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    startPushData = getPushFromIntent(intent);
    checkMessage(intent);
}