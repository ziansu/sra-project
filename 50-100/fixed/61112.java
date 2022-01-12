private void doResize(final com.ait.lienzo.client.core.shape.wires.event.AbstractWiresEvent.Type type, final int index, final com.ait.lienzo.client.widget.DragContext dragContext) {
    final double[] size = resize();
    getHandlerManager().fireEvent(new com.ait.lienzo.client.core.shape.wires.event.ResizeEvent(this, index, dragContext, size[0], size[1], type));
}