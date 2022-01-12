public static java.lang.String acquire(redis.clients.jedis.Jedis jedis, java.lang.String name, long timeout) {
    java.lang.String token = java.util.UUID.randomUUID().toString();
    long timestamp = (java.lang.System.currentTimeMillis()) + timeout;
    while (timestamp >= (java.lang.System.currentTimeMillis())) {
        java.lang.Long result = jedis.setnx(((com.hason.redis.lock.DistributedLock.PREFIX) + name), token);
        if (result == 1) {
            return token;
        }
        com.hason.redis.lock.DistributedLock.sleep(1);
    } 
    return null;
}