public void stop() {
    audioTrack.stop();
    audioTrack.release();
    audioTrack = null;
}