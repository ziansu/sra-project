private void highlight(final org.kie.workbench.common.stunner.core.graph.Node node, final org.kie.workbench.common.stunner.core.graph.Edge<org.kie.workbench.common.stunner.core.graph.content.view.View<?>, org.kie.workbench.common.stunner.core.graph.Node> connector, final boolean valid) {
    canvasHighlight.unhighLight();
    if ((null != node) && valid) {
        canvasHighlight.highLight(connector);
        canvasHighlight.highLight(node);
    }else
        if (null != node) {
            canvasHighlight.invalid(connector);
            canvasHighlight.invalid(node);
        }
    
}