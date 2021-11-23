public java.util.Set<redis.clients.jedis.Tuple> zrangeByScoreWithScores(final byte[] key, final byte[] min, final byte[] max, final int offset, final int count) {
    checkIsInMulti();
    client.zrangeByScoreWithScores(key, min, max, offset, count);
    java.util.Set<redis.clients.jedis.Tuple> set = getBinaryTupledSet();
    return set;
}