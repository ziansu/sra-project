public void handleMouseEvent(net.drewke.tdme.gui.nodes.GUINode node, net.drewke.tdme.gui.events.GUIMouseEvent event) {
    if ((((node == (this.node)) && (node.isEventBelongingToNode(event))) && ((event.getType()) == (net.drewke.tdme.gui.events.GUIMouseEvent.Type.MOUSE_RELEASED))) && ((event.getButton()) == 1)) {
        node.getScreenNode().setFoccussedNode(((net.drewke.tdme.gui.nodes.GUIElementNode) (node)));
        event.setProcessed(true);
    }
}