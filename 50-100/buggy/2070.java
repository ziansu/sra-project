public java.util.Set<redis.clients.jedis.Tuple> zrevrangeByScoreWithScores(final byte[] key, final byte[] max, final byte[] min) {
    checkIsInMulti();
    client.zrevrangeByScoreWithScores(key, max, min);
    java.util.Set<redis.clients.jedis.Tuple> set = getBinaryTupledSet();
    return set;
}