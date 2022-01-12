public void navigateParamGroup(org.opentravel.schemacompiler.model.TLParamGroup paramGroup) {
    if ((canVisit(paramGroup)) && (visitor.visitParamGroup(paramGroup))) {
        java.util.List<org.opentravel.schemacompiler.model.TLParameter> parameters = new java.util.ArrayList(paramGroup.getParameters());
        navigateDocumentation(paramGroup.getDocumentation());
        for (org.opentravel.schemacompiler.model.TLParameter parameter : parameters) {
            navigateParameter(parameter);
        }
    }
    addVisitedNode(paramGroup);
}