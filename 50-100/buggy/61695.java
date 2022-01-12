public void saveChangesAtomically() throws net.cubespace.geSuit.core.storage.StorageException {
    boolean USE_TRANSACTIONS = true;
    redis.clients.jedis.Jedis jedis = null;
    try {
        if (USE_TRANSACTIONS) {
            redis.clients.jedis.Transaction transaction = jedis.multi();
            saveChanges(transaction);
            transaction.exec();
        }else {
            jedis = redis.getJedis();
            saveChanges(jedis);
        }
    } catch (redis.clients.jedis.exceptions.JedisException e) {
        throw handleJedisException(jedis, e);
    } finally {
        redis.returnJedis(jedis);
    }
}