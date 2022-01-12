public static com.twineworks.tweakflow.lang.scope.Scope findModuleScope(com.twineworks.tweakflow.lang.scope.Scope s) {
    java.util.Objects.requireNonNull(s);
    com.twineworks.tweakflow.lang.scope.Scope currentScope = s;
    while (!(com.twineworks.tweakflow.lang.scope.Scopes.isModuleScope(currentScope))) {
        currentScope = currentScope.getEnclosingScope();
        if (currentScope == null) {
            throw new java.lang.AssertionError("Cannot find enclosing module");
        }
    } 
    return currentScope;
}