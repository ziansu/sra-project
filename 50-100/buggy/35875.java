@org.junit.Test
public void testNotValidGetSetNbPlottedPoints() {
    shape.setNbPlottedPoints(200);
    shape.setNbPlottedPoints(1);
    org.junit.Assert.assertEquals(200, shape.getNbPlottedPoints());
    shape.setNbPlottedPoints(0);
    org.junit.Assert.assertEquals(200, shape.getNbPlottedPoints());
    shape.setNbPlottedPoints((-1));
    org.junit.Assert.assertEquals(200, shape.getNbPlottedPoints());
    shape.setNbPlottedPoints(1);
    org.junit.Assert.assertEquals(200, shape.getNbPlottedPoints());
}