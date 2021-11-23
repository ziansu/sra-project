public java.lang.String shutdown() {
    client.shutdown();
    java.lang.String status = null;
    try {
        status = client.getStatusCodeReply();
    } catch (redis.clients.jedis.exceptions.JedisException ex) {
        status = null;
    }
    return status;
}