public static void Vibrate(final android.app.Activity activity, long[] pattern, boolean isRepeat) {
    android.os.Vibrator vib = ((android.os.Vibrator) (activity.getSystemService(Service.VIBRATOR_SERVICE)));
    vib.vibrate(pattern, (isRepeat ? 1 : -1));
}