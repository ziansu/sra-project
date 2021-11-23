public byte[] brpoplpush(byte[] source, byte[] destination, int timeout) {
    client.brpoplpush(source, destination, timeout);
    client.setTimeoutInfinite();
    byte[] reply = client.getBinaryBulkReply();
    client.rollbackTimeout();
    return reply;
}