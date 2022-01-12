private java.lang.String get(java.lang.String key, java.lang.String deflt) {
    java.lang.String value = properties.getProperty(key);
    if (value == null)
        value = deflt;
    
    if (value == null)
        return null;
    
    return replaceMacros(value);
}