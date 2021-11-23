@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((speech) != null) {
        speech.destroy();
        android.util.Log.i(LOG_TAG, "destroy");
    }
}