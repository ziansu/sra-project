public java.util.Set<redis.clients.jedis.Tuple> zrevrangeByScoreWithScores(final byte[] key, final byte[] max, final byte[] min, final int offset, final int count) {
    checkIsInMulti();
    client.zrevrangeByScoreWithScores(key, max, min, offset, count);
    return getBinaryTupledSet();
}