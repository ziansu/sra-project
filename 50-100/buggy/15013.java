private void setUpInterruptRecordingConfiguration() {
    isRecording = false;
    startStopButton.setText(R.string.start_recording);
    setSampleRateDisabilityStatus(true);
    recordTask.cancel(true);
    chronometer.stop();
    stopRecording();
    processBtn.setEnabled(true);
    startStopButton.setEnabled(false);
}