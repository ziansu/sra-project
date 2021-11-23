private void generateLastChunk(com.firefly.codec.http2.encode.HttpGenerator generator, com.firefly.net.Session tcpSession) throws java.io.IOException {
    java.nio.ByteBuffer chunk = com.firefly.utils.io.BufferUtils.allocate(HttpGenerator.CHUNK_SIZE);
    com.firefly.codec.http2.encode.HttpGenerator.Result generatorResult = generate(null, null, chunk, null, true);
    if ((generatorResult == (HttpGenerator.Result.FLUSH)) && ((generator.getState()) == (HttpGenerator.State.COMPLETING))) {
        tcpSession.encode(chunk);
        generateLastData(generator);
    }else {
        generateHTTPMessageExceptionally(generatorResult, generator.getState());
    }
}