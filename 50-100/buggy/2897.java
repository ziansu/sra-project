@org.junit.Test
public void remove_test() {
    one.remove("not in set");
    assertTrue(one.contains("one"));
    assertEquals(1, one.size());
    many.remove("one");
    assertFalse(many.contains("one"));
    assertEquals(1, many.size());
}