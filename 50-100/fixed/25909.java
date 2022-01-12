private static java.lang.String getStringField(final java.util.Map<java.lang.String, java.lang.String> sampleDatum, final java.lang.String name) {
    java.lang.String str = sampleDatum.get(name.toUpperCase());
    if (null != str)
        str = str.trim();
    
    if ((null == str) || (str.isEmpty()))
        return null;
    
    return str;
}