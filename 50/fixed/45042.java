@java.lang.Override
public java.util.Set<java.lang.Long> get(T k1) {
    java.lang.Long id = ((java.lang.Long) (k1));
    if (lookup.containsKey(id)) {
        return convertArr(lookup.get(id));
    }
    return null;
}