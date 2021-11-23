@java.lang.SuppressWarnings(value = "unchecked")
public static <T> T[] toArray(java.lang.Class<T> type, java.util.Collection<T> list) {
    if ((list.size()) == 0)
        return ((T[]) (java.lang.reflect.Array.newInstance(type, 0)));
    
    T[] a = ((T[]) (java.lang.reflect.Array.newInstance(type, list.size())));
    return list.toArray(a);
}