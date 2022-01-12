private static boolean equals(java.util.Properties p, java.lang.String optionKey, java.lang.String optionValue, boolean caseSensitive) {
    java.lang.String v = p.getProperty(optionKey);
    if (v == null)
        return false;
    
    if (caseSensitive)
        v = v.toLowerCase();
    
    return v.equals(optionValue);
}