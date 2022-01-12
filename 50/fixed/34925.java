private boolean isHashingDisabled(java.lang.String type) {
    if (!(enableHashing)) {
        return true;
    }
    try (redis.clients.jedis.Jedis jedis = source.getJedis()) {
        return jedis.exists(hashesDisabled(type));
    }
}