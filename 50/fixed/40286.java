@java.lang.Override
protected void onPause() {
    super.onPause();
    stopListenX();
    if ((recognizer) != null) {
        recognizer.cancel();
        recognizer.shutdown();
    }
}