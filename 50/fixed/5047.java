public static boolean getPoolTestOnBorrow() {
    return me.ellios.jedis.util.RedisConfigFileParsers.HEDWIG_CONFIG.getBoolean("redis.pool.testOnBorrow", true);
}