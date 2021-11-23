@java.lang.Override
public java.util.List<byte[]> blpop(final byte[] arg) {
    return new redis.clients.jedis.JedisClusterCommand<java.util.List<byte[]>>(connectionHandler, timeout, maxRedirections) {
        @java.lang.Override
        public java.util.List<byte[]> execute(redis.clients.jedis.Jedis connection) {
            return connection.blpop(arg);
        }
    }.runBinary(arg);
}