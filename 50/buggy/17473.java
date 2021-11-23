@org.junit.Test
public void testtoString() {
    com.github.fishio.Vec2d vec1 = new com.github.fishio.Vec2d(6, 5);
    java.lang.String represent = new java.lang.String("Vec2d [x=6.0, y=5.0]");
    org.junit.Assert.assertEquals(represent, vec1.toString());
}