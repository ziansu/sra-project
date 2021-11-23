private java.lang.String getExpressionForOperation(org.eclipse.sirius.viewpoint.description.tool.InitialOperation initialOperation) {
    if (initialOperation != null) {
        return ("aql:self.executeOperation('" + (org.eclipse.emf.ecore.util.EcoreUtil.getURI(initialOperation).toString())) + "')";
    }
    return null;
}