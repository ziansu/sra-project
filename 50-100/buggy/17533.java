private void changeTrackingState() {
    if (mRequestingLocationUpdates) {
        mRequestingLocationUpdates = false;
        stopLocationUpdates();
        updateUiThread.interrupt();
        this.startTrackingButton.setText("START TRACKING");
    }else {
        mRequestingLocationUpdates = true;
        startLocationUpdates();
        beginUiUpdates();
        this.startTrackingButton.setText("STOP TRACKING");
    }
    updateUI();
}