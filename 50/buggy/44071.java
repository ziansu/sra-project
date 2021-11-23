@java.lang.Override
public java.lang.Object doWithRedis(redis.clients.jedis.Jedis jedis) {
    java.util.Map<byte[], byte[]> result = jedis.hgetAll(id.toString().getBytes());
    return result.size();
}