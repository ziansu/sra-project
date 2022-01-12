public void discard() {
    try {
        if (isPipelined()) {
            pipeline(new org.springframework.data.redis.connection.jedis.JedisConnection.JedisStatusResult(pipeline.discard()));
            return ;
        }
        transaction.discard();
    } catch (java.lang.Exception ex) {
        throw convertJedisAccessException(ex);
    } finally {
        txResults.clear();
        transaction = null;
    }
}