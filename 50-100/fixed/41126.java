@org.junit.Test
public void test2ShapesMirrorVertical() {
    shape.setPosition(100, 200);
    shape2.setPosition((-100), (-200));
    shape.mirrorVertical(shape.getGravityCentre().getMiddlePoint(shape2.getGravityCentre()));
    assertEquals(100.0, shape.getX(), 1.0E-5);
    assertEquals((-200.0), shape.getY(), 1.0E-5);
}