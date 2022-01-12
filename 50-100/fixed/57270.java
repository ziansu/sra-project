@java.lang.Override
public void layoutIt(final com.ait.lienzo.client.core.shape.IPrimitive<?> child) {
    final double x = (getWidth()) / 2;
    final double y = (getHeight()) / 2;
    child.setX(x);
    child.setY(y);
}