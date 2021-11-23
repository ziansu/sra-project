@java.lang.Override
protected void onDestroy() {
    try {
        if ((vibrator) != null)
            vibrator.cancel();
        
    } catch (java.lang.Exception e) {
    }
    try {
        mediaPlayer.stop();
    } catch (java.lang.Exception e) {
    }
    try {
        mediaPlayer.release();
        finishAndRemoveTask();
    } catch (java.lang.Exception e) {
    }
    super.onDestroy();
}