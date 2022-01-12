public static <K, V> java.lang.Iterable<java.util.Map.Entry<K, V>> makeIterable(final java.util.Map<K, V> map) {
    if ((map == null) || (map.isEmpty())) {
        return ovation.odata.util.CollectionUtils.makeEmptyIterable();
    }
    return ovation.odata.util.CollectionUtils.makeIterable(map.entrySet());
}