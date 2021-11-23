@org.junit.Test
public void checkAvailability() {
    assertFalse(b.isTaken());
    b.setTaken();
    assertTrue(b.isTaken());
}