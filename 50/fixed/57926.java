@java.lang.Override
protected void onPause() {
    if ((mBarcodePicker) != null) {
        mBarcodePicker.stopScanning();
    }
    mPaused = true;
    super.onPause();
}