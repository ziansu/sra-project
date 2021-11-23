public void initialize(java.util.Properties redisConfiguration) {
    host = redisConfiguration.getProperty(RedisConstants.REDIS_HOST);
    port = redisConfiguration.getProperty(RedisConstants.REDIS_PORT);
    password = redisConfiguration.getProperty(RedisConstants.REDIS_PASSWORD);
    pool = new redis.clients.jedis.JedisPool(new redis.clients.jedis.JedisPoolConfig(), "192.168.123.101");
    jedis = pool.getResource();
    if (((password) != null) && (!(password.trim().isEmpty()))) {
        jedis.auth(password);
    }
}