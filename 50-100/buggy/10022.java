public void testEncodeAndDecodeWithPrefix() throws java.lang.Exception {
    java.lang.String encodedWithPrefix = org.datacleaner.util.SecurityUtils.encodePasswordWithPrefix(org.datacleaner.util.SecurityUtilsTest.PLAIN_TEXT_VALUE);
    assertEquals(org.datacleaner.util.SecurityUtilsTest.ENCODED_VALUE_WITH_PREFIX, encodedWithPrefix);
    java.lang.String decoded = org.datacleaner.util.SecurityUtils.decodePasswordWithPrefix(encodedWithPrefix);
    assertEquals(org.datacleaner.util.SecurityUtilsTest.PLAIN_TEXT_VALUE, decoded);
    decoded = org.datacleaner.util.SecurityUtils.decodePasswordWithPrefix(org.datacleaner.util.SecurityUtilsTest.ENCODED_VALUE);
    assertEquals(org.datacleaner.util.SecurityUtilsTest.PLAIN_TEXT_VALUE, decoded);
}