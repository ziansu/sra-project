public java.util.Set<java.lang.String> randomOpenIdSet(java.lang.Long count) throws com.zoe.weiya.comm.exception.InternalException, com.zoe.weiya.comm.exception.NotStartException {
    java.util.Set<java.lang.String> set = new java.util.HashSet<java.lang.String>();
    set.addAll(randomOpenIds(count));
    return set;
}