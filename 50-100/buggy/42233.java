public record.wave.ComplexBufferWaveRecorder getBasebandRecorder(java.lang.String channelName) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(properties.SystemProperties.getInstance().getApplicationFolder("recordings"));
    sb.append(java.io.File.separator);
    sb.append(channelName);
    sb.append("_baseband");
    return new record.wave.ComplexBufferWaveRecorder(record.RecorderManager.AUDIO_SAMPLE_RATE, sb.toString());
}