public static <T> T[] toArray(java.lang.Class<?> type, java.util.Collection<T> l) {
    @java.lang.SuppressWarnings(value = "unchecked")
    T[] a = ((T[]) (java.lang.reflect.Array.newInstance(type, l.size())));
    return l.toArray(a);
}