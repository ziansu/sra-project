public static org.pooledbytearray.config.PoolConfig bsPoolDefault() {
    int bufferSize = 1024 * 1024;
    org.pooledbytearray.config.PoolConfig<org.pooledbytearray.buffer.bytes.Buffer> bufferPoolConfig = new org.pooledbytearray.config.PoolConfig(50, 20, bufferSize, new org.pooledbytearray.factory.ByteArrayBufferFactory(bufferSize));
    return bufferPoolConfig;
}