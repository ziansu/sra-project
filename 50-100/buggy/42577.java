public long lpush(java.lang.String key, java.lang.String value) throws java.lang.Exception {
    redis.clients.jedis.Jedis jedis = null;
    java.lang.String subUserHashKey = ((localConstant.getProjectName()) + ":") + key;
    try {
        jedis = jedisPool.getResource();
        return jedis.lpush(subUserHashKey, value);
    } finally {
        jedis.close();
    }
}