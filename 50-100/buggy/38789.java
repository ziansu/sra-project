private <T> T getValue(java.lang.Class<T> t) {
    java.lang.Class<?> vt = value.getClass();
    if (vt != t)
        throw new java.lang.RuntimeException(((("Type mismatch: expected " + (vt.getName())) + " instead of ") + (t.getName())));
    
    return t.cast(value);
}