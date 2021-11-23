@java.lang.Override
public java.util.Set<java.lang.String> spop(final java.lang.String key, final long count) {
    return new redis.clients.jedis.JedisClusterCommand<java.util.Set<java.lang.String>>(connectionHandler, timeout, maxRedirections) {
        @java.lang.Override
        public java.util.Set<java.lang.String> execute(redis.clients.jedis.Jedis connection) {
            return connection.spop(key, count);
        }
    }.run(key);
}