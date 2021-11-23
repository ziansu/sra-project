public java.lang.String get(java.lang.String key) throws java.lang.Exception {
    redis.clients.jedis.Jedis jedis = null;
    java.lang.String subUserHashKey = ((localConstant.getProjectName()) + ":") + key;
    try {
        jedis = jedisPool.getResource();
        return jedis.get(subUserHashKey);
    } finally {
        jedis.close();
    }
}