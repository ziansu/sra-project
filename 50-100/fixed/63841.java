@java.lang.Override
public void update() {
    rectangle.setY(xyz.jamesnuge.slicktest.util.ConversionUtility.toViewportY(getCenterPos().y));
    rectangle.setX(xyz.jamesnuge.slicktest.util.ConversionUtility.toViewportX(getCenterPos().x));
    if ((body.getAngle()) != 0) {
        graphicalObject = rectangle.transform(org.newdawn.slick.geom.Transform.createRotateTransform(xyz.jamesnuge.slicktest.util.ConversionUtility.toViewportAngle(body.getAngle()), rectangle.getCenterX(), rectangle.getCenterY()));
    }
}