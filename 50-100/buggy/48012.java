public java.util.List<byte[]> blpop(byte[]... args) {
    checkIsInMulti();
    client.blpop(args);
    client.setTimeoutInfinite();
    final java.util.List<byte[]> multiBulkReply = client.getBinaryMultiBulkReply();
    client.rollbackTimeout();
    return multiBulkReply;
}