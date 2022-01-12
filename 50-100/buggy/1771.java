public static redis.clients.jedis.Jedis getConnection() throws java.net.URISyntaxException {
    if (java.lang.System.getProperty("ENV_SYSTEM").equalsIgnoreCase("local")) {
        redis.clients.jedis.Jedis jedis = new redis.clients.jedis.Jedis("localhost");
        return jedis;
    }else {
        java.net.URI redisURI = new java.net.URI(java.lang.System.getenv("REDIS_URL"));
        redis.clients.jedis.Jedis jedis = new redis.clients.jedis.Jedis(redisURI);
        return jedis;
    }
}