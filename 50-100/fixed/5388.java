protected void testEqualSeconds(java.lang.String s, java.util.Date expected, java.util.Date actual) {
    if (expected == null) {
        org.junit.Assert.assertNull(s, actual);
    }else {
        org.junit.Assert.assertNotNull(s, actual);
        long esec = (expected.getTime()) / 1000L;
        long asec = (actual.getTime()) / 1000L;
        org.junit.Assert.assertEquals(s, esec, asec);
    }
}