@org.junit.Test
public void givenARectangle_whenGettingCenterWithoutVector_returnCenterCorrectly() throws java.lang.Exception {
    com.badlogic.gdx.math.Vector2 center = new com.badlogic.gdx.math.Vector2();
    rectangle.getCenter(center);
    assertEquals("Wrong X value", 2.5, center.x, 0);
    assertEquals("Wrong Y value", 4, center.y, 0);
    rectangle2.getCenter(center);
    assertEquals("Wrong X value", 1.5, center.x, 0);
    assertEquals("Wrong Y value", 1.5, center.y, 0);
}