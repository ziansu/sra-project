public void onDestroy() {
    super.onDestroy();
    if ((mRadioService) != null) {
        mRadioService.stop();
    }
    doUnbindService();
    mBroadcastManager.unregisterReceiver(mBroadcastReceiver);
    timerHandler.removeCallbacks(timerRunnable);
}