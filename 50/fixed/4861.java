protected synchronized void close() {
    if ((opusDecoder) != null) {
        Opus.INSTANCE.opus_decoder_destroy(opusDecoder);
        opusDecoder = null;
    }
}