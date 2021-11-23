private static java.lang.Boolean contains(final java.lang.Iterable<java.lang.String> source, final java.lang.String orders) {
    for (final java.lang.String src : source) {
        if (orders.equals(src))
            return true;
        
    }
    return false;
}