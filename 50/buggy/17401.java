public static <K, V> com.opentable.data.structures.SequenceMap<java.lang.Iterable<K>, K, V> forIterable() {
    return new com.opentable.data.structures.SequenceMap<java.lang.Iterable<K>, K, V>(java.util.function.Function.identity());
}