public void seekTo(int x) {
    boolean wasPlaying = isPlaying();
    sPressedSeek = true;
    stop();
    playbackStart = ((int) (x * ((wycliffeassociates.recordingapp.AudioInfo.SAMPLERATE) / 500.0)));
    if ((audioData) != null) {
        playbackStart = java.lang.Math.max(java.lang.Math.min(audioData.capacity(), playbackStart), 0);
    }else {
        playbackStart = 0;
    }
    if (wasPlaying) {
        play();
    }
}