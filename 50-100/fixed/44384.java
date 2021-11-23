public void set(java.lang.String k, java.util.Set<java.lang.String> v) {
    if (null == k) {
        throw new java.lang.NullPointerException();
    }
    if (null == v) {
        throw new java.lang.NullPointerException();
    }
    com.google.enterprise.adaptor.Metadata.assureNoNulls(v);
    if (v.isEmpty()) {
        mappings.remove(k);
    }else {
        mappings.put(k, v);
    }
}