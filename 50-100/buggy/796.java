@java.lang.Override
protected void assertElementsEqual(java.lang.Object expected, java.lang.Object actual) {
    if (expected instanceof java.lang.Double)
        org.junit.Assert.assertEquals(((java.lang.Double) (expected)), ((java.lang.Double) (actual)), fDelta);
    else
        org.junit.Assert.assertEquals(((java.lang.Float) (expected)), ((java.lang.Float) (actual)), fDelta);
    
}