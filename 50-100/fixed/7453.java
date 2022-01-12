private static synchronized void startVibrate() {
    if ((org.catrobat.catroid.utils.VibratorUtil.vibrator) != null) {
        android.util.Log.d(org.catrobat.catroid.utils.VibratorUtil.TAG, "startVibrate()");
        org.catrobat.catroid.utils.VibratorUtil.startTime = android.os.SystemClock.uptimeMillis();
        org.catrobat.catroid.utils.VibratorUtil.vibrator.vibrate(org.catrobat.catroid.utils.VibratorUtil.MAX_TIME_TO_VIBRATE);
        android.util.Log.d(org.catrobat.catroid.utils.VibratorUtil.TAG, ("start time was: " + (java.lang.Long.toString(org.catrobat.catroid.utils.VibratorUtil.startTime))));
    }
}