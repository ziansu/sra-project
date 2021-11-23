@org.junit.Test
public void testAlternativeFlow() throws java.lang.Exception {
    samples.expectnew.ExpectNewDemo tested = new samples.expectnew.ExpectNewDemo();
    org.powermock.api.mockito.PowerMockito.whenNew(java.io.DataInputStream.class).withArguments(null).thenThrow(new java.lang.RuntimeException("error"));
    java.io.InputStream stream = tested.alternativePath();
    org.powermock.api.mockito.PowerMockito.verifyNew(java.io.DataInputStream.class).withArguments(null);
    org.junit.Assert.assertNotNull("The returned inputstream should not be null.", stream);
    org.junit.Assert.assertTrue("The returned inputstream should be an instance of ByteArrayInputStream.", (stream instanceof java.io.ByteArrayInputStream));
}