public int getPlayBufferSize() {
    int minBufferSize = android.media.AudioTrack.getMinBufferSize(44100, AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_16BIT);
    return minBufferSize;
}