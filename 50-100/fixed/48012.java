public java.util.List<byte[]> blpop(byte[]... args) {
    checkIsInMulti();
    client.blpop(args);
    client.setTimeoutInfinite();
    try {
        return client.getBinaryMultiBulkReply();
    } finally {
        client.rollbackTimeout();
    }
}