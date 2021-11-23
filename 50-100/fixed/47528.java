@org.junit.Test
public void testSimple() {
    ru.spbau.mit.StringSet stringSet = ru.spbau.mit.StringSetTest.instance();
    assertTrue(stringSet.add("abc"));
    assertTrue(stringSet.remove("abc"));
    assertFalse(stringSet.contains("a"));
    assertFalse(stringSet.contains("abc"));
    assertEquals(0, stringSet.size());
    assertEquals(0, stringSet.howManyStartsWithPrefix("abc"));
}