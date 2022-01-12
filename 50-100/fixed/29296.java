public byte[] brpoplpush(byte[] source, byte[] destination, int timeout) {
    client.brpoplpush(source, destination, timeout);
    client.setTimeoutInfinite();
    try {
        return client.getBinaryBulkReply();
    } finally {
        client.rollbackTimeout();
    }
}