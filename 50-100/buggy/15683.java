private boolean inScope(java.lang.String prefix, java.lang.String uri) {
    for (java.util.Map<java.lang.String, java.lang.String> scope : scopeDeque) {
        java.lang.String bound = scope.get(prefix);
        if (bound != null) {
            if (uri.equals(bound))
                return true;
            
        }
    }
    return false;
}