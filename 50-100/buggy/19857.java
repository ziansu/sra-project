@java.lang.Override
protected java.lang.Float doInBackground(java.lang.Void... params) {
    float currentBrightness = brightness;
    if ((screenFadeTime) > 0) {
        final long millis = (screenFadeTime) / (com.zhun.sununtouch.smart_sunrise.AlarmActivity.BRIGHTNESS_STEPS);
        currentBrightness = 0.0F;
        while (currentBrightness < (brightness)) {
            publishProgress(currentBrightness);
            currentBrightness += (brightness) / (com.zhun.sununtouch.smart_sunrise.AlarmActivity.BRIGHTNESS_STEPS);
            android.os.SystemClock.sleep(millis);
        } 
    }
    return currentBrightness;
}