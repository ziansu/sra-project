@org.junit.Test
public void testGetCompletions4() {
    java.util.List<java.lang.String> completions = suffixTrie.getCompletions("bananas", 50);
    assertEquals(0, completions.size());
}