@org.junit.Test
public void testMoveUp() {
    Space_Invaders.Bullet b = new Space_Invaders.Bullet(1, 20, new Space_Invaders.SpriteSheet(g.getSpriteSheet()));
    g.setrunning(true);
    b.moveUp();
    org.junit.Assert.assertEquals(((double) (19.4)), b.getY(), 1.0E-5);
    org.junit.Assert.assertEquals(true, g.getrunning());
}