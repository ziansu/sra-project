public void stopAudioMonitor() throws javax.sound.sampled.LineUnavailableException {
    if ((sink) != null) {
        if ((monitorAudio) == true) {
            monitorAudio = false;
        }
        sink.closeOutput();
    }
    sink = null;
}