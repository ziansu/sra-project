@java.lang.Override
public void putAll(final java.util.Map<? extends java.lang.String, ? extends java.lang.Object> m) {
    for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : entrySet()) {
        java.lang.String key = entry.getKey();
        java.lang.Object value = entry.getValue();
        put(key, value);
    }
}