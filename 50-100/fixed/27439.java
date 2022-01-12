private void resetPatternEntry(java.lang.String displayText) {
    android.widget.TextView tv = ((android.widget.TextView) (getView(R.id.lock_screen_pattern_display)));
    try {
        tv.setText(displayText);
    } catch (java.lang.NullPointerException e) {
        android.util.Log.e(com.vitaminbacon.lockscreendialer.LockScreenKeypadPatternActivity.TAG, "Incompatible layout with this activity.", e);
        onFatalError();
    }
}