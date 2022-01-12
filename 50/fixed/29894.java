@org.junit.Test
public void removeMissingValueShouldReturnNull() {
    assertNull(map.remove(1));
    assertEquals(0, map.size());
}