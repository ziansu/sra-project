void setupHeader(android.media.AudioRecord rec, int length, int bufferSize) throws java.io.IOException {
    long byteRate = (((icechen1.com.blackbox.audio.WAVAudioFileWriter.RECORDER_BPP) * (rec.getSampleRate())) * (rec.getChannelCount())) / 8;
    long totalDataLen = bufferSize + 36;
    writeWaveFileHeader(os, bufferSize, totalDataLen, rec.getSampleRate(), rec.getChannelCount(), byteRate);
}