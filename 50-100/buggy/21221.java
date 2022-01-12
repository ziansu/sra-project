@java.lang.Override
public void layoutIt(final com.ait.lienzo.client.core.shape.IPrimitive<?> child) {
    final double y = (getHeight()) / 2;
    final com.ait.lienzo.client.core.types.BoundingBox bb = child.getBoundingBox();
    final double bbw = bb.getWidth();
    final double bbh = bb.getHeight();
    child.setX(((getWidth()) - bbw));
    child.setY((y - (bbh / 2)));
}