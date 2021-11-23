private <T> T getValue(java.lang.Class<T> t) {
    java.lang.Class<?> vt = value.getClass();
    if (vt != t)
        throw new java.lang.RuntimeException(((("Type mismatch: expected " + (t.getName())) + " instead of ") + (vt.getName())));
    
    return t.cast(value);
}