public java.lang.String getSingleProperty(java.lang.String key, java.lang.String defaultValue) {
    java.lang.String r = getSingleProperty(key);
    if ((r == null) || ("".equals(r)))
        r = defaultValue;
    
    return r;
}