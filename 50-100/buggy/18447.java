@org.junit.Test
public void getUserId() {
    assertEquals(lib.getId("Mayer"), 1);
    assertEquals(lib.getId("Mayer"), 1);
    assertEquals(lib.getId("Miller"), 2);
    assertEquals(lib.getId("Miller"), 2);
}