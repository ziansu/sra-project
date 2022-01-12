@org.testng.annotations.Test
public void testSubtractBusinessKey() throws java.lang.Exception {
    boolean assert_ = false;
    try {
        spreadsheet.mapper.utils.FieldUtils.subtractBusinessKey("test.int1");
    } catch (java.lang.IllegalArgumentException e) {
        spreadsheet.mapper.utils.FieldUtilsTest.LOGGER.debug("\'test.int1\' not business key");
        if (e.getMessage().contains("business key")) {
            assert_ = true;
        }
    }
    assertTrue(assert_);
    java.lang.String s = spreadsheet.mapper.utils.FieldUtils.subtractBusinessKey(((FieldUtils.BUSINESS_KEY_PREFIX) + "test.int1"));
    assertEquals(s, "test.int1");
}