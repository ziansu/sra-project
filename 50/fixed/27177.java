@java.lang.Override
public void deleteChildNode(final org.kie.workbench.common.stunner.core.graph.Node<org.kie.workbench.common.stunner.core.graph.content.definition.Definition<?>, org.kie.workbench.common.stunner.core.graph.Edge> node) {
    getCommand().addCommand(new org.kie.workbench.common.stunner.core.client.canvas.command.DeleteCanvasNodeCommand(node));
}