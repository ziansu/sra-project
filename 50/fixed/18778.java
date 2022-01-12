private void stopRecording() {
    if ((recorder) != null) {
        recorder.stop();
        recorder.release();
        recorder = null;
    }
}