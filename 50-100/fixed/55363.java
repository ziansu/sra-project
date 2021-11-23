public static void Vibrate(android.content.Context context, long[] pattern, boolean isRepeat) {
    android.os.Vibrator vib = ((android.os.Vibrator) (context.getSystemService(Service.VIBRATOR_SERVICE)));
    vib.vibrate(pattern, (isRepeat ? 1 : -1));
}