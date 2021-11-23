public java.lang.String rpop(java.lang.String key) throws java.lang.Exception {
    redis.clients.jedis.Jedis jedis = null;
    java.lang.String subUserHashKey = ((localConstant.getProjectName()) + ":") + key;
    try {
        jedis = jedisPool.getResource();
        return jedis.rpop(subUserHashKey);
    } finally {
        if (jedis != null) {
            jedis.close();
        }
    }
}