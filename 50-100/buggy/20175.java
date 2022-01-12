private void readAndSpawn(final int amount, final java.util.function.Consumer<byte[]> callback) {
    final byte[] data = readStream.read(amount);
    callback.accept(data);
    server.getThreadPool().submit(() -> {
        callback.accept(data);
    });
}