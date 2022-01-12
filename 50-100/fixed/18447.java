@org.junit.Test
public void getUserId() {
    assertEquals(lib.getId("Mayer"), 0);
    assertEquals(lib.getId("Mayer"), 0);
    assertEquals(lib.getId("Miller"), 1);
    assertEquals(lib.getId("Miller"), 1);
}