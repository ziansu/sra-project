public java.nio.ByteBuffer cachedRead(long position, int size, java.nio.ByteOrder order) throws java.io.IOException {
    de.carne.filescanner.spi.FileScannerInput.Cache cache = de.carne.filescanner.spi.FileScannerInput.CACHE.get();
    if (cache == null) {
        cache = new de.carne.filescanner.spi.FileScannerInput.Cache(de.carne.filescanner.spi.FileScannerInput.LOG);
        de.carne.filescanner.spi.FileScannerInput.CACHE.set(cache);
    }
    return cache.read(position, size, order);
}