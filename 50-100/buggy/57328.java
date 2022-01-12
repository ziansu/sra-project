private T run(boolean retry) {
    try (redis.clients.jedis.Jedis jedis = plugin.getPool().getResource()) {
        return call(jedis);
    } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
        plugin.getLogger().log(java.util.logging.Level.SEVERE, "Unable to get connection", e);
        if (!retry) {
            try {
                java.lang.Thread.sleep(1000);
            } catch (java.lang.InterruptedException e1) {
                throw new java.lang.RuntimeException("task failed to run", e1);
            }
            run(true);
        }
    }
    throw new java.lang.RuntimeException("task failed to run");
}