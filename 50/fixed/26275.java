public void subscribe(redis.clients.jedis.BinaryJedisPubSub jedisPubSub, byte[]... channels) {
    client.setTimeoutInfinite();
    try {
        jedisPubSub.proceed(client, channels);
    } finally {
        client.rollbackTimeout();
    }
}