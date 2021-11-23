public java.lang.Object execute(final org.workflowlite.core.ExecutionContext context, final java.lang.Object source) {
    final org.eclipse.uml2.uml.InitialNode initialNode = ((org.eclipse.uml2.uml.InitialNode) (org.eclipse.emf.ecore.util.EcoreUtil.getObjectByType(this.umlActivity.getNodes(), UMLPackage.Literals.INITIAL_NODE)));
    return executeAll(context, source, getNextNode(initialNode));
}