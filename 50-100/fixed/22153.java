public boolean toggleAudioMonitor(decoder.SinkAudio s, boolean monitorFiltered, int position) throws javax.sound.sampled.LineUnavailableException {
    sink = s;
    common.Config.monitorFilteredAudio = monitorFiltered;
    monitorAudio = !(monitorAudio);
    if (!(monitorAudio)) {
        sink.closeOutput();
        sink = null;
    }else {
        sink.setDevice(position);
    }
    return monitorAudio;
}