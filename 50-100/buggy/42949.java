public java.lang.String rpoplpush(java.lang.String popKey, java.lang.String pushKey) throws java.lang.Exception {
    redis.clients.jedis.Jedis jedis = null;
    java.lang.String subUserHashPopKey = ((localConstant.getProjectName()) + ":") + popKey;
    java.lang.String subUserHashPushKey = ((localConstant.getProjectName()) + ":") + pushKey;
    try {
        jedis = jedisPool.getResource();
        return jedis.rpoplpush(subUserHashPopKey, subUserHashPushKey);
    } finally {
        jedis.close();
    }
}