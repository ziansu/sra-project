public com.ait.lienzo.client.core.shape.wires.WiresShape createShape(final com.ait.lienzo.client.core.shape.wires.MultiPath path) {
    com.ait.lienzo.client.core.shape.wires.Group group = new com.ait.lienzo.client.core.shape.wires.Group();
    group.add(path);
    group.setEventPropagationMode(EventPropagationMode.FIRST_ANCESTOR);
    com.ait.lienzo.client.core.shape.wires.WiresShape shape = new com.ait.lienzo.client.core.shape.wires.WiresShape(path, group, this);
    registerShape(shape);
    return shape;
}