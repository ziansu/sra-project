public java.lang.String getNextDomain() {
    redis.clients.jedis.Jedis jedis = jedisPool.getResource();
    java.lang.String nextdomain = null;
    try {
        nextdomain = jedis.spop(jedisQueueName);
    } finally {
        jedisPool.returnResource(jedis);
    }
    return nextdomain;
}