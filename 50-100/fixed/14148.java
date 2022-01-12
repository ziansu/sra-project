public void testTreeBlocking() throws java.lang.Exception {
    runFilterTest("blah.deblah", "blah,blah.deblah.deblah", false, new java.lang.String[]{ "blah" , "blah.deblah" , "blah.deblah.deblah" });
    assertEquals(1, getParameterNames().size());
    assertEquals(getParameterNames().iterator().next(), "blah.deblah");
}