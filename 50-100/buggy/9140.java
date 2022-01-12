private void refresh(org.eclipse.wst.sse.core.internal.provisional.IModelStateListener listener, org.eclipse.wst.xml.core.internal.provisional.document.IDOMModel model, org.jboss.tools.windup.windup.CustomRuleProvider ruleProvider) {
    model.removeModelStateListener(listener);
    listenerMap.remove(ruleProvider);
    documentMap.remove(model.getDocument());
    if (!(treeViewer.getTree().isDisposed())) {
        treeViewer.refresh(ruleProvider);
    }
}