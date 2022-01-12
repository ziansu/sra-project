public void setMonitorAudio(decoder.SinkAudio s, boolean m, int position) throws java.lang.IllegalArgumentException, javax.sound.sampled.LineUnavailableException {
    if ((sink) == null) {
        sink = s;
        monitorAudio = m;
        if (monitorAudio) {
            sink.setDevice(position);
        }
    }else {
        sink = s;
        monitorAudio = m;
        if (!(monitorAudio)) {
            sink.closeOutput();
            sink = null;
        }
    }
}