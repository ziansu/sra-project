private void showStartButtonArmed(android.widget.Button startButton) {
    long startTime = android.os.SystemClock.elapsedRealtime();
    long elapsedTime;
    long runningFlashDuration = com.paceraudio.numberreactor.app.activities.TimeCounter.ARMED_START_BUTTON_FLASH_DURATION;
    while (com.paceraudio.numberreactor.app.activities.TimeCounter.isStartClickable) {
        elapsedTime = (android.os.SystemClock.elapsedRealtime()) - startTime;
        if (elapsedTime >= runningFlashDuration) {
            com.paceraudio.numberreactor.app.activities.TimeCounter.FlashStartButtonRunnable runnable = new com.paceraudio.numberreactor.app.activities.TimeCounter.FlashStartButtonRunnable(startButton);
            mHandler.post(runnable);
            runningFlashDuration += com.paceraudio.numberreactor.app.activities.TimeCounter.ARMED_START_BUTTON_FLASH_DURATION;
        }
    } 
}