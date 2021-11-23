@org.junit.Test
public void test2ShapesMirrorVertical() {
    shape.setPosition(100, 200);
    shape2.setPosition((-100), (-200));
    shape.mirrorVertical(shape.getGravityCentre().getMiddlePoint(shape2.getGravityCentre()));
    org.junit.Assert.assertEquals(100.0, shape.getX(), 1.0E-5);
    org.junit.Assert.assertEquals((-200.0), shape.getY(), 1.0E-5);
}