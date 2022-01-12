private static java.lang.Boolean contains(final java.lang.Iterable<java.lang.String> iterSource, final java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.Boolean>> orders) {
    if (iterSource == null)
        return false;
    
    for (final java.util.Map.Entry<java.lang.String, java.lang.Boolean> ord : orders) {
        if (!(com.dslplatform.client.Utils.contains(iterSource, ord.getKey())))
            return false;
        
    }
    return true;
}