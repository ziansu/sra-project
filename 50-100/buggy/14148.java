public void testTreeBlocking() throws java.lang.Exception {
    runFilterTest("blah.deblah", "blah,blah.deblah.deblah", false, new java.lang.String[]{ "blah" , "blah.deblah" , "blah.deblah.deblah" });
    java.util.Collection paramNames = getParameterNames();
    assertEquals(1, paramNames.size());
    assertEquals(paramNames.iterator().next(), "blah.deblah");
}