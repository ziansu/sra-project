public void navigateParamGroup(org.opentravel.schemacompiler.model.TLParamGroup paramGroup) {
    if ((canVisit(paramGroup)) && (visitor.visitParamGroup(paramGroup))) {
        navigateDocumentation(paramGroup.getDocumentation());
        for (org.opentravel.schemacompiler.model.TLParameter parameter : paramGroup.getParameters()) {
            navigateParameter(parameter);
        }
    }
    addVisitedNode(paramGroup);
}