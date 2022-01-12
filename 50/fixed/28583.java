@java.lang.Override
public java.lang.Object put(java.lang.Object key, java.lang.Object value) {
    java.lang.Object temp = super.put(key, value);
    return (override) == null ? temp : override.put(key, value);
}