private void startRecording() {
    if ((recorder) == null) {
        initializeRecorder();
    }
    recorder.start();
    (recordCount)++;
}