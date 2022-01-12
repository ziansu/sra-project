@java.lang.Override
public long hash(byte[] key) {
    return tools.dsn_crc64(key);
}