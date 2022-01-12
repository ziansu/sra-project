public nl.renarj.jasdb.api.SimpleEntity addProperty(java.lang.String propertyName, java.util.List<java.lang.String> stringValues) {
    for (java.lang.String value : stringValues) {
        addValueToProperty(propertyName, true, new nl.renarj.jasdb.api.StringValue(value));
    }
    return this;
}