public void setRecordingEnabled(boolean enabled) {
    this.recordingEnabled = enabled;
    virtualFrequency = source.getFrequency();
    virtualSampleRate = source.getSampleRate();
}