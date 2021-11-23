private static void initialPool() {
    if ((com.eweblib.util.RedisUtil.jedisPool) == null) {
        redis.clients.jedis.JedisPoolConfig config = new redis.clients.jedis.JedisPoolConfig();
        config.setMaxTotal(2000);
        config.setMaxIdle(50);
        config.setTestOnBorrow(false);
        com.eweblib.util.RedisUtil.jedisPool = new redis.clients.jedis.JedisPool(config, com.eweblib.cfg.ConfigManager.getProperty("redis_server"), 6379);
    }
}