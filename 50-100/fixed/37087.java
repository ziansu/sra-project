public static java.lang.String afterLastIndex(java.lang.String string, java.lang.String c) {
    if (string == null)
        return null;
    
    int pos = string.lastIndexOf(c);
    if (pos < 0)
        return string;
    
    return string.substring((pos + (c.length())));
}