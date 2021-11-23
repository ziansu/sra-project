public void testRead(final java.lang.String filepath, final org.javatuples.Triplet<java.io.File, java.lang.Boolean, java.lang.Boolean> params) {
    org.junit.Assert.assertEquals(filepath, params.getValue0().getAbsolutePath());
    org.junit.Assert.assertTrue(params.getValue1());
    org.junit.Assert.assertFalse(params.getValue2());
}