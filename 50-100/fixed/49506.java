@android.annotation.TargetApi(value = 21)
private void renderOutputBufferV21(android.media.MediaCodec codec, int bufferIndex, long releaseTimeNs) {
    maybeNotifyVideoSizeChanged();
    com.google.android.exoplayer2.util.TraceUtil.beginSection("releaseOutputBuffer");
    codec.releaseOutputBuffer(bufferIndex, releaseTimeNs);
    com.google.android.exoplayer2.util.TraceUtil.endSection();
    (decoderCounters.renderedOutputBufferCount)++;
    consecutiveDroppedFrameCount = 0;
}