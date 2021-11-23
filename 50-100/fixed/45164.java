public java.util.Map<java.lang.String, java.lang.String> headers() {
    java.util.Map<java.lang.String, java.lang.String> retHeaders = new java.util.HashMap<java.lang.String, java.lang.String>();
    java.util.Set<java.lang.String> keys = headers.keySet();
    for (java.lang.String key : keys) {
        if (key == null)
            continue;
        
        java.util.List<java.lang.String> values = headers.get(key);
        for (java.lang.String value : values) {
            retHeaders.put(key, value);
        }
    }
    return retHeaders;
}