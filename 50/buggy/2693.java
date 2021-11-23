@java.lang.Override
protected void onPause() {
    super.onPause();
    sm.unregisterListener(this);
    try {
        lm.removeUpdates(this);
    } catch (java.lang.SecurityException se) {
        android.util.Log.e("This app", "exception", se);
    }
}