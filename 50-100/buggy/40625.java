public java.lang.String brpoplpush(java.lang.String source, java.lang.String destination, int timeout) {
    client.brpoplpush(source, destination, timeout);
    client.setTimeoutInfinite();
    java.lang.String reply = client.getBulkReply();
    client.rollbackTimeout();
    return reply;
}