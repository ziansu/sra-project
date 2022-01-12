@org.junit.Test
public void testNotValidGetSetNbPlottedPoints() {
    shape.setNbPlottedPoints(200);
    shape.setNbPlottedPoints(1);
    assertEquals(200, shape.getNbPlottedPoints());
    shape.setNbPlottedPoints(0);
    assertEquals(200, shape.getNbPlottedPoints());
    shape.setNbPlottedPoints((-1));
    assertEquals(200, shape.getNbPlottedPoints());
    shape.setNbPlottedPoints(1);
    assertEquals(200, shape.getNbPlottedPoints());
}