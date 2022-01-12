public void setMonitorAudio(decoder.SinkAudio s, boolean m, int position) throws java.lang.IllegalArgumentException, javax.sound.sampled.LineUnavailableException {
    sink = s;
    if ((sink) != null) {
        monitorAudio = m;
        if (!(monitorAudio))
            sink.closeOutput();
        else {
            sink.setDevice(position);
        }
    }
}