@org.junit.Test
public void testKmpFailureFunction1() {
    char[] pattern = "ACACAGT".toCharArray();
    int[] borderTable = matcher.kmpFailureFunction(pattern, 0);
    org.hamcrest.MatcherAssert.assertThat(box(borderTable, 0), org.hamcrest.Matchers.arrayContaining(0, 0, 1, 2, 3, 0, 0));
}