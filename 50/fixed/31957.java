public java.lang.String getString(java.lang.String key) {
    if (null == key)
        return null;
    
    return this.values.get(key);
}