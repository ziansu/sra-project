@java.lang.Override
public void start() {
    if ((audioRecord) == null) {
        audioRecord = new android.media.AudioRecord(MediaRecorder.AudioSource.MIC, com.novoda.canvas.audioviz.SimpleSoundMeter.SAMPLE_RATE, android.media.AudioFormat.CHANNEL_IN_MONO, android.media.AudioFormat.ENCODING_PCM_16BIT, minBufferSize);
    }
    audioRecord.startRecording();
}