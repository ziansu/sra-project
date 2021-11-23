@org.junit.Test
public void testSetIsDead() {
    p.setIsDead(true);
    assertTrue(p.isDead());
    p.setIsDead(true);
    assertFalse(p.isDead());
}