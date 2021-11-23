@org.junit.Test
public void initXCoordinate_Nan() throws java.lang.Exception {
    assertEquals(new asteroids.model.Vector(0, 0), new asteroids.model.Vector(0, java.lang.Double.NaN));
}