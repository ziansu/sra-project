@java.lang.Override
public de.neemann.digital.builder.circuit.Box doLayout() {
    fragment.setPos(new de.neemann.digital.draw.graphics.Vector(((de.neemann.digital.draw.shapes.GenericShape.SIZE) * 2), 0));
    de.neemann.digital.builder.circuit.Box b = fragment.doLayout();
    return new de.neemann.digital.builder.circuit.Box(((2 * (de.neemann.digital.draw.shapes.GenericShape.SIZE)) + (b.getWidth())), b.getHeight());
}