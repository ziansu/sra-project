public void setRecordingEnabled(boolean enabled) {
    this.recordingEnabled = enabled;
    if (enabled) {
        virtualFrequency = source.getFrequency();
        virtualSampleRate = source.getSampleRate();
    }
}