@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public boolean allowTarget(final org.wirez.core.graph.Node target, final org.wirez.core.graph.Edge<org.wirez.core.graph.content.view.View<?>, org.wirez.core.graph.Node> connector, final int magnet) {
    if ((null != (canvasHandler)) && (null != target)) {
        org.wirez.core.command.CommandResult<org.wirez.core.client.command.CanvasViolation> violations = canvasCommandManager.allow(canvasHandler, canvasCommandFactory.SET_TARGET_NODE(target, connector, magnet));
        return isAccept(violations);
    }
    return false;
}