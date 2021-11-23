private void doResize(final com.ait.lienzo.client.core.shape.wires.event.AbstractWiresEvent.Type type, final int index, final int x, final int y, final com.ait.lienzo.client.widget.DragContext dragContext) {
    final double[] size = resize(0, 1, 2, 3);
    getHandlerManager().fireEvent(new com.ait.lienzo.client.core.shape.wires.event.ResizeEvent(this, index, x, y, dragContext, size[2], size[3], type));
}