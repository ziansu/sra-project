public static <V> boolean isLast(java.util.List<V> list, V object) {
    V last = com.navercorp.pinpoint.rpc.util.ListUtils.getLast(list);
    return last.equals(object);
}