public java.util.Set<redis.clients.jedis.Tuple> zrangeByScoreWithScores(final byte[] key, final byte[] min, final byte[] max) {
    checkIsInMulti();
    client.zrangeByScoreWithScores(key, min, max);
    java.util.Set<redis.clients.jedis.Tuple> set = getBinaryTupledSet();
    return set;
}