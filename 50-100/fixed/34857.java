private java.lang.Object findConvertedKey(java.util.Set<?> keySet, java.lang.Object key) {
    for (java.lang.Object k : keySet) {
        if (key.equals(k))
            return k;
        
    }
    for (java.lang.Object k : keySet) {
        java.lang.Object c = convertingImpl.converter.convert(k).to(key.getClass());
        if ((c != null) && (c.equals(key)))
            return k;
        
    }
    return key;
}