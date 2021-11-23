@org.junit.Test
@junitparams.Parameters(method = "data")
public void verifyInversionCounting(int[] input, long expected) {
    org.junit.Assert.assertThat(com.github.tyshchenko.algs4fun.hackerrank.CountingInversions.countInversions(input), org.hamcrest.CoreMatchers.is(expected));
}