protected void assertEqualIntArrays(final int[] expected, final int[] actual) {
    org.junit.Assert.assertEquals(expected.length, actual.length);
    for (int index = 0; index < (expected.length); index++) {
        org.junit.Assert.assertEquals(expected[index], actual[index]);
    }
}