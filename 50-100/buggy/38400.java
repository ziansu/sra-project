public static void flushStorage(redis.clients.jedis.JedisPool pool, java.lang.String prefix) {
    org.zakariya.mrdoodleserver.SyncServer.logger.info("Deleting all storage under the {}* namespace", prefix);
    try (redis.clients.jedis.Jedis jedis = pool.getResource()) {
        java.util.Set<java.lang.String> keys = jedis.keys((prefix + "*"));
        keys.forEach(jedis::del);
    }
}