@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    setVibrationStop();
    stopMusic();
    stopLED();
}