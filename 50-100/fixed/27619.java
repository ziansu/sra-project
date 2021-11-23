@org.junit.Test
public void testKmpFailureFunction2() {
    char[] pattern = "012ACACAGT".toCharArray();
    int[] borderTable = matcher.kmpFailureFunction(pattern, 3);
    org.hamcrest.MatcherAssert.assertThat(box(borderTable, 3), org.hamcrest.Matchers.arrayContaining(0, 0, 1, 2, 3, 0, 0));
}