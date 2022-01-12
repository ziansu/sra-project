@java.lang.Override
public java.lang.Object doWithRedis(redis.clients.jedis.Jedis jedis) {
    java.util.Map<byte[], byte[]> result = jedis.hgetAll(id.getBytes());
    return result.size();
}