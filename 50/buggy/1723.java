@java.lang.Override
public void onNodeDragMove(final com.ait.lienzo.client.core.shape.wires.NodeDragMoveEvent event) {
    doResize(AbstractWiresEvent.Type.STEP, index, event.getX(), event.getY(), event.getDragContext());
}