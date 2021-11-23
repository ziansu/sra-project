@java.lang.Override
public boolean allowSource(final org.wirez.core.graph.Node source, final org.wirez.core.graph.Edge<org.wirez.core.graph.content.view.View<?>, org.wirez.core.graph.Node> connector, final int magnet) {
    if (null != (canvasHandler)) {
        org.wirez.core.command.CommandResult<org.wirez.core.client.command.CanvasViolation> violations = canvasCommandManager.allow(canvasHandler, canvasCommandFactory.SET_SOURCE_NODE(source, connector, magnet));
        return isAccept(violations);
    }
    return true;
}