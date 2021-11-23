protected void close() {
    Opus.INSTANCE.opus_decoder_destroy(opusDecoder);
}