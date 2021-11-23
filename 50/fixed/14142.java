public void onDestroy() {
    super.onDestroy();
    if ((mRadioService) != null) {
        mRadioService.stop();
    }
    doUnbindService();
    timerHandler.removeCallbacks(timerRunnable);
}