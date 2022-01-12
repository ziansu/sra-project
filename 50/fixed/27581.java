@java.lang.Override
public java.lang.Object doWithRedis(redis.clients.jedis.Jedis jedis) {
    jedis.del(id);
    return null;
}