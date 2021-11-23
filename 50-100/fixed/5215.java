@java.lang.Override
public java.lang.Boolean scriptExists(final java.lang.String sha1, final java.lang.String key) {
    return new redis.clients.jedis.JedisClusterCommand<java.lang.Boolean>(connectionHandler, timeout, maxRedirections) {
        @java.lang.Override
        public java.lang.Boolean execute(redis.clients.jedis.Jedis connection) {
            return connection.scriptExists(sha1);
        }
    }.run(key);
}