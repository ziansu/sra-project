@java.lang.Override
protected void onResume() {
    android.util.Log.i(com.hydraproductions.cicada.PhoneStatus.TAG, "ON RESUME");
    paint = new android.graphics.Paint();
    paint.setTextAlign(Paint.Align.CENTER);
    paint.setTypeface(Typeface.DEFAULT_BOLD);
    paint.setAntiAlias(false);
    paint.setTextSize(16);
    telephonyManager.listen(phoneStateListener, PhoneStateListener.LISTEN_SIGNAL_STRENGTHS);
    invalidate();
}