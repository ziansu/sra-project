@org.junit.Test
public void testSimple() {
    ru.spbau.mit.StringSet stringSet = ru.spbau.mit.StringSetTest.instance();
    assertTrue(stringSet.add("abc"));
    assertFalse(stringSet.contains("a"));
    assertTrue(stringSet.contains("abc"));
    assertEquals(1, stringSet.size());
    assertEquals(1, stringSet.howManyStartsWithPrefix("abc"));
}