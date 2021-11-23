@java.lang.Override
public java.lang.String scriptLoad(final java.lang.String script, final java.lang.String key) {
    return new redis.clients.jedis.JedisClusterCommand<java.lang.String>(connectionHandler, timeout, maxRedirections) {
        @java.lang.Override
        public java.lang.String execute(redis.clients.jedis.Jedis connection) {
            return connection.scriptLoad(script);
        }
    }.run(1, key);
}