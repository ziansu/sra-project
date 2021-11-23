@java.lang.Override
public java.lang.Object eval(final java.lang.String script, final java.lang.String key) {
    return new redis.clients.jedis.JedisClusterCommand<java.lang.Object>(connectionHandler, timeout, maxRedirections) {
        @java.lang.Override
        public java.lang.Object execute(redis.clients.jedis.Jedis connection) {
            return connection.eval(script);
        }
    }.run(1, key);
}