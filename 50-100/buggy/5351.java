@java.lang.Override
public void run(javafx.scene.Node node, javafx.scene.Node dragNode) {
    (this.executions)++;
    if (dragNode != node) {
        javafx.event.Event.fireEvent(node, dockEnterEvent.copyFor(this, node));
        if (dragNode != null) {
            javafx.event.Event.fireEvent(dragNode, dockExitEvent.copyFor(this, dragNode));
        }
        dragNodes.put(node.getScene().getWindow(), node);
    }
    javafx.event.Event.fireEvent(node, dockOverEvent.copyFor(this, node));
}