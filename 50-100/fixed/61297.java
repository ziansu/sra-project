@java.lang.Override
public java.util.List<java.lang.Boolean> scriptExists(final java.lang.String key, final java.lang.String... sha1) {
    return new redis.clients.jedis.JedisClusterCommand<java.util.List<java.lang.Boolean>>(connectionHandler, timeout, maxRedirections) {
        @java.lang.Override
        public java.util.List<java.lang.Boolean> execute(redis.clients.jedis.Jedis connection) {
            return connection.scriptExists(sha1);
        }
    }.run(key);
}