@org.junit.Test
public void checkAvailability() {
    assertFalse(b.isTaken());
    b.setTaken(true);
    assertTrue(b.isTaken());
}