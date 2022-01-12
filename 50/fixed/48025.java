public java.util.Set<java.lang.String> parse(java.lang.String rawValue) {
    if (rawValue == null)
        return null;
    
    return new java.util.HashSet<java.lang.String>(net.instant.util.Util.parseCommaList(rawValue));
}