private void generateTrailer(com.firefly.codec.http2.encode.HttpGenerator generator, com.firefly.net.Session tcpSession) throws java.io.IOException {
    java.nio.ByteBuffer trailer = getTrailerByteBuffer();
    com.firefly.codec.http2.encode.HttpGenerator.Result generatorResult = generate(null, null, trailer, null, true);
    if ((generatorResult == (HttpGenerator.Result.FLUSH)) && ((generator.getState()) == (HttpGenerator.State.COMPLETING))) {
        tcpSession.encode(trailer);
        generateLastData(generator);
    }else {
        generateHTTPMessageExceptionally(generatorResult, generator.getState());
    }
}