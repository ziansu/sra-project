@java.lang.Override
public void putAll(java.util.Map<? extends java.lang.String, ? extends K> add) {
    for (java.util.Map.Entry<? extends java.lang.String, ? extends K> entry : add.entrySet()) {
        put(entry.getKey(), entry.getValue());
    }
}