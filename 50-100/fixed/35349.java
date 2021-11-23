private org.eclipse.uml2.uml.ActivityNode execute(final org.workflowlite.core.ExecutionContext context, final java.lang.Object source, final org.eclipse.uml2.uml.OpaqueAction umlAction) {
    final org.workflowlite.core.Action<org.workflowlite.core.ExecutionContext, java.lang.Object> actionImplementation = beanInstantiator.getAction(org.workflowlite.core.uml.UmlUtils.createBeanId(umlAction), context, source, this.output);
    this.output = actionImplementation.execute(context);
    return getNextNode(umlAction);
}