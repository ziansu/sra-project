public void lpushList(java.lang.String key, java.util.List<java.lang.String> valueList) throws java.lang.Exception {
    redis.clients.jedis.Jedis jedis = null;
    java.lang.String subUserHashKey = ((localConstant.getProjectName()) + ":") + key;
    try {
        jedis = jedisPool.getResource();
        for (java.lang.String value : valueList) {
            jedis.lpush(subUserHashKey, value);
        }
    } finally {
        jedis.close();
    }
}