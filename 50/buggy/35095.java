public void subscribe(final redis.clients.jedis.JedisPubSub jedisPubSub, final java.lang.String... channels) {
    client.setTimeoutInfinite();
    jedisPubSub.proceed(client, channels);
    client.rollbackTimeout();
}