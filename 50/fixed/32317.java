public java.util.List<byte[]> hvals(final byte[] key) {
    checkIsInMulti();
    client.hvals(key);
    return client.getBinaryMultiBulkReply();
}