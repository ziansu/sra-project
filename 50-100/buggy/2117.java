@org.junit.Test
public void givenARectangle_whenGettingCenterWithoutVector_returnCenterCorrectly() throws java.lang.Exception {
    com.badlogic.gdx.math.Vector2 center = rectangle.getCenter();
    assertEquals("Wrong X value", 2.5, center.x, 0);
    assertEquals("Wrong Y value", 4, center.y, 0);
    com.badlogic.gdx.math.Vector2 center2 = rectangle2.getCenter();
    assertEquals("Wrong X value", 1.5, center2.x, 0);
    assertEquals("Wrong Y value", 1.5, center2.y, 0);
}