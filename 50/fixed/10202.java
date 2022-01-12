private boolean scopeClassMatches(final java.lang.Object scope, final java.lang.Object usersScopeClass) {
    if ((scope == null) || (usersScopeClass == null)) {
        return false;
    }
    return usersScopeClass.equals(scope.getClass());
}