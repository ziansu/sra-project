public java.util.Dictionary<java.lang.String, java.lang.String> getProperties() {
    java.util.Dictionary<java.lang.String, java.lang.String> output = new java.util.Hashtable<java.lang.String, java.lang.String>();
    if (null != (properties)) {
        for (java.lang.String key : properties.keySet()) {
            output.put(key, properties.get(key));
        }
    }
    return output;
}