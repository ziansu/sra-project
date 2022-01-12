@org.junit.Test
public void testifReturnsOnlyLimitedWords() throws java.lang.Exception {
    java.lang.String expected = "a " + "\n";
    java.lang.String actual = Wrapper.wrap("a b", 2);
    assertEquals(expected, actual);
}