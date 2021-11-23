public static rsb.Scope generateScope(final java.lang.String scope) throws org.openbase.jul.exception.CouldNotPerformException {
    rst.rsb.ScopeType.Scope.Builder generatedScope = ScopeType.Scope.newBuilder();
    for (java.lang.String component : scope.split("/")) {
        generatedScope.addComponent(org.openbase.jul.extension.rsb.scope.ScopeGenerator.convertIntoValidScopeComponent(component));
    }
    return generatedScope.build();
}