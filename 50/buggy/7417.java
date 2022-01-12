@org.junit.Test
public void testPatternIIa5() {
    java.lang.String word = "abaaa";
    org.hamcrest.MatcherAssert.assertThat(matcher.containsPatternII(word.toCharArray(), 'a', 'b'), org.hamcrest.Matchers.is(true));
}