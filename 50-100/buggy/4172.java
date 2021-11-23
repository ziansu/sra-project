private void assertLPS(java.lang.String[] values) {
    java.lang.String lcsString = algorithms.dp.TestLongestPalindromicSubstring.longestPalindromicSubstring.longestPS(values[0]);
    org.junit.Assert.assertEquals(values[1].length(), lcsString.length());
    if ((lcsString.length()) > 0) {
        org.junit.Assert.assertEquals(values[1], lcsString);
    }
}