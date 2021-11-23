@java.lang.Override
public void layoutIt(final com.ait.lienzo.client.core.shape.IPrimitive<?> child) {
    final double x = (getWidth()) / 2;
    final com.ait.lienzo.client.core.types.BoundingBox bb = child.getBoundingBox();
    final double bbh = bb.getHeight();
    child.setX(x);
    child.setY(((getHeight()) - (bbh / 2)));
}