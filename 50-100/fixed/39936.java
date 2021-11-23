@java.lang.Override
public void putAll(final java.util.Map<? extends java.lang.String, ? extends java.lang.Object> m) {
    for (java.util.Map.Entry<? extends java.lang.String, ? extends java.lang.Object> entry : m.entrySet()) {
        java.lang.String key = entry.getKey();
        java.lang.Object value = entry.getValue();
        put(key, value);
    }
}