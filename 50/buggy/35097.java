public void stopAudioMonitor(decoder.SinkAudio s) throws javax.sound.sampled.LineUnavailableException {
    sink = s;
    if ((monitorAudio) == true) {
        monitorAudio = false;
    }
    if ((sink) != null)
        sink.closeOutput();
    
}