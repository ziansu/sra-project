@java.lang.Override
public com.didapinche.commons.redis.Jedis getSlaveResource() {
    int index = randomSlaveIndex.nextInt(slaveHaps.size());
    com.didapinche.commons.redis.JedisPool jedisPool = slaveJedisPoolMap.get(slaveHaps.indexOf(index));
    return jedisPool.getResource();
}