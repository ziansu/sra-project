public java.lang.Long showListLength(java.lang.String key) throws java.lang.Exception {
    redis.clients.jedis.Jedis jedis = null;
    java.lang.String subUserHashKey = ((localConstant.getProjectName()) + ":") + key;
    try {
        jedis = jedisPool.getResource();
        return jedis.llen(subUserHashKey);
    } finally {
        if (jedis != null) {
            jedis.close();
        }
    }
}