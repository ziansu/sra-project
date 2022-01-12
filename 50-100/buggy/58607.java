@org.junit.Test
public void testWrittenByMultipleTweetsSingleAuthor() {
    java.util.List<twitter.Tweet> writtenBy = twitter.Filter.writtenBy(java.util.Arrays.asList(twitter.FilterTest.tweet1, twitter.FilterTest.tweet2, twitter.FilterTest.tweet3), "alyssa");
    assertEquals("expected singleton list", 2, writtenBy.size());
    assertEquals("expected list to contain tweet", writtenBy.get(0).equals(twitter.FilterTest.tweet1));
    assertTrue("expected list to contain tweet", writtenBy.get(1).equals(twitter.FilterTest.tweet3));
}