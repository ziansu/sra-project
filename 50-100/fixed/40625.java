public java.lang.String brpoplpush(java.lang.String source, java.lang.String destination, int timeout) {
    client.brpoplpush(source, destination, timeout);
    client.setTimeoutInfinite();
    try {
        return client.getBulkReply();
    } finally {
        client.rollbackTimeout();
    }
}