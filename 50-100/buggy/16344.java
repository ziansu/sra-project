public java.lang.Long hget(java.lang.String key, java.lang.String field, java.lang.String value) {
    redis.clients.jedis.JedisCommands jedis = null;
    java.lang.Long ret = null;
    try {
        jedis = ((redis.clients.jedis.JedisCommands) (pool.getResource()));
        ret = jedis.hset(key, field, value);
    } catch (java.lang.Exception e) {
        throw new org.xson.thirdparty.redis.JedisRuntimeException((("hget operation exception, key[" + key) + "]"), e);
    } finally {
        recycle(jedis);
    }
    return ret;
}