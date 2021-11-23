@java.lang.Override
protected void onPause() {
    try {
        manager.onPause();
        camPreview.onPause();
    } catch (java.lang.RuntimeException e) {
    }
    super.onPause();
}