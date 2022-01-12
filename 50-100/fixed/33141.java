public static java.lang.Long delete(int dbIndex, java.lang.String pattern) {
    java.util.Set<java.lang.String> keysSet = com.puyixiaowo.medis.utils.RedisUtils.keys(dbIndex, pattern);
    java.lang.String[] keys = keysSet.toArray(new java.lang.String[keysSet.size()]);
    if ((keys.length) == 0) {
        return 0L;
    }
    return com.puyixiaowo.medis.utils.RedisUtils.delete(dbIndex, keys);
}