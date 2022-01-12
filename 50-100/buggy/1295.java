@java.lang.Override
public void queueInputBuffer(com.google.android.exoplayer2.text.SubtitleInputBuffer inputBuffer) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
    com.google.android.exoplayer2.util.Assertions.checkArgument((inputBuffer != null));
    com.google.android.exoplayer2.util.Assertions.checkArgument((inputBuffer == (dequeuedInputBuffer)));
    if (inputBuffer.isDecodeOnly()) {
        releaseInputBuffer(inputBuffer);
    }else {
        queuedInputBuffers.add(inputBuffer);
    }
    dequeuedInputBuffer = null;
}