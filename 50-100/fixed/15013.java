private void setUpInterruptRecordingConfiguration() {
    isRecording = false;
    startStopButton.setText(R.string.start_recording);
    setSampleRateDisabilityStatus(true);
    recordTask.cancel(true);
    processBtn.setEnabled(true);
    startStopButton.setEnabled(false);
    chronometer.stop();
}