protected void onResume() {
    super.onResume();
    stepDetector.onResume();
    android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.MAIN");
}