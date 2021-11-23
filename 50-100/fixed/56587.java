@org.springframework.context.annotation.Bean
public redis.clients.jedis.JedisPool getJedisPool() {
    try {
        java.net.URI redisURI = new java.net.URI(java.lang.System.getenv("REDISTOGO_URL"));
        return new redis.clients.jedis.JedisPool(new redis.clients.jedis.JedisPoolConfig(), redisURI.getHost(), redisURI.getPort(), redis.clients.jedis.Protocol.DEFAULT_TIMEOUT, redisURI.getUserInfo().split(":", 2)[1]);
    } catch (java.net.URISyntaxException e) {
        throw new java.lang.RuntimeException(("Redis couldn't be configured from URL in REDISTOGO_URL env var: " + (java.lang.System.getenv("REDISTOGO_URL"))));
    }
}