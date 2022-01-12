private static java.lang.Boolean contains(final java.lang.Iterable<java.lang.String> source, final java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.Boolean>> orders) {
    if (source == null)
        return false;
    
    for (final java.util.Map.Entry<java.lang.String, java.lang.Boolean> ord : orders) {
        if (!(com.dslplatform.client.Utils.contains(source, ord.getKey())))
            return false;
        
    }
    return true;
}