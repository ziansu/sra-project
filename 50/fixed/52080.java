private java.lang.String getValueOrDefault(java.lang.String value, java.lang.String def) {
    if (value == null) {
        return def;
    }else
        if ("".equalsIgnoreCase(value)) {
            return def;
        }
    
    return value;
}