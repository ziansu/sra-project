public msi.gama.util.GamaMap<java.lang.String, java.lang.Object> primGetFromClient(final msi.gama.runtime.IScope scope) throws msi.gama.runtime.exceptions.GamaRuntimeException {
    final java.lang.String cli;
    java.lang.String receiveMessage = "";
    msi.gama.util.GamaMap<java.lang.String, java.lang.Object> m = ((msi.gama.util.GamaMap<java.lang.String, java.lang.Object>) (scope.getAgentScope().getAttribute(("messages" + (scope.getAgentScope())))));
    scope.getAgentScope().setAttribute(("messages" + (scope.getAgentScope())), GamaMapFactory.EMPTY_MAP);
    return m;
}