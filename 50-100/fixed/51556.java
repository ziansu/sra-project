private void testRead(final java.io.File file, final org.javatuples.Triplet<java.io.File, java.lang.Boolean, java.lang.Boolean> params) {
    org.junit.Assert.assertEquals(file.getAbsolutePath(), params.getValue0().getAbsolutePath());
    org.junit.Assert.assertTrue(params.getValue1());
    org.junit.Assert.assertFalse(params.getValue2());
}