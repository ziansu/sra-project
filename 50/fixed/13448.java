@java.lang.Override
protected void onPause() {
    try {
        camPreview.onPause();
        manager.onPause();
    } catch (java.lang.RuntimeException e) {
    }
    super.onPause();
}