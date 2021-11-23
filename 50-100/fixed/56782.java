protected void assertEqualIntArrays(final int[] expected, final int[] actual) {
    assertEquals(expected.length, actual.length);
    for (int index = 0; index < (expected.length); index++) {
        assertEquals(expected[index], actual[index]);
    }
}