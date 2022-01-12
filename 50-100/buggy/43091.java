public void config() {
    initType();
    redis.clients.jedis.JedisPoolConfig config = new redis.clients.jedis.JedisPoolConfig();
    config.setMaxIdle(5);
    config.setTestOnBorrow(false);
    redis.clients.jedis.JedisPool jedisPool = new redis.clients.jedis.JedisPool(config, "127.0.0.1", 6379);
    this.jedis = jedisPool.getResource();
}