public void onDestroy() {
    super.onDestroy();
    log.info("Destroying ActivityRecognitionLocationProvider");
    stopRecording();
    disconnectFromPlayAPI();
    if ((detectedActivitiesReceiver) != null) {
        unregisterReceiver(detectedActivitiesReceiver);
    }
}