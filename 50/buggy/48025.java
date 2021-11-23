public java.util.Set<java.lang.String> parse(java.lang.String rawValue) {
    return new java.util.HashSet<java.lang.String>(net.instant.util.Util.parseCommaList(rawValue));
}