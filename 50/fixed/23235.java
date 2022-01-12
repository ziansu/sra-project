public void onClick(android.content.DialogInterface dialog, int whichButton) {
    if ((mMediaRecorder) != null) {
        this.click();
    }
    if (symbol1) {
        mySensorManager.unregisterListener(sensorEventListener);
    }
    finish();
}