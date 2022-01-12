public void muxAnnexbFrames() {
    int outBufferIndex = vencoder.dequeueOutputBuffer(vebi, 0);
    if (outBufferIndex >= 0) {
        java.nio.ByteBuffer bb = vencoder.getOutputBuffer(outBufferIndex);
        onEncodedAnnexbFrame(bb, vebi);
        vencoder.releaseOutputBuffer(outBufferIndex, false);
    }
}