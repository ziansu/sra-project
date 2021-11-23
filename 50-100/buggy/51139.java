@org.junit.Test
public void testKmpFailureFunction3() {
    char[] pattern = "PARTICIPATE IN PARACHUTE".toCharArray();
    int[] borderTable = matcher.kmpFailureFunction(pattern, 0);
    org.hamcrest.MatcherAssert.assertThat(box(borderTable), org.hamcrest.Matchers.arrayContaining(0, 0, 0, 0, 0, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0));
}