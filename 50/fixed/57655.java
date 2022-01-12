@java.lang.Override
protected void onPause() {
    if ((speech) != null) {
        speech.destroy();
        android.util.Log.i(LOG_TAG, "destroy");
    }
    super.onPause();
}