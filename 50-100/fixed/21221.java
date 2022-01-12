@java.lang.Override
public void layoutIt(final com.ait.lienzo.client.core.shape.IPrimitive<?> child) {
    final double y = (getHeight()) / 2;
    final com.ait.lienzo.client.core.types.BoundingBox bb = child.getBoundingBox();
    final double bbw = bb.getWidth();
    child.setX(((getWidth()) - (bbw / 2)));
    child.setY(y);
}