@java.lang.Override
public java.lang.Long move(final byte[] key, final int dbIndex) {
    return new redis.clients.jedis.JedisClusterCommand<java.lang.Long>(connectionHandler, timeout, maxRedirections) {
        @java.lang.Override
        public java.lang.Long execute(redis.clients.jedis.Jedis connection) {
            return connection.move(key, dbIndex);
        }
    }.runBinary(null);
}