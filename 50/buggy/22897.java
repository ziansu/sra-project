public void stopFetchingAudio() {
    audioRecorder.setRecordPositionUpdateListener(null);
    stop();
    payloadSize = 0;
}