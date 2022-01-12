public static <V> boolean isFirst(java.util.List<V> list, V object) {
    V first = com.navercorp.pinpoint.rpc.util.ListUtils.getFirst(list);
    return first.equals(object);
}