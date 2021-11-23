public java.util.List<java.lang.String> randomOpenIds(java.lang.Long count) throws com.zoe.weiya.comm.exception.InternalException, com.zoe.weiya.comm.exception.NotStartException {
    java.util.List<java.lang.String> list = new java.util.ArrayList<>();
    list.addAll(randomOpenIdSet(count));
    return list;
}