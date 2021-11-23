@java.lang.Override
public java.lang.Long persist(final java.lang.String key) {
    return new redis.clients.jedis.JedisClusterCommand<java.lang.Long>(connectionHandler, timeout, maxRedirections) {
        @java.lang.Override
        public java.lang.Long execute(redis.clients.jedis.Jedis connection) {
            return connection.persist(key);
        }
    }.run(key);
}