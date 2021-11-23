@org.junit.Test
public void testNewWithRuntimeException() throws java.lang.Exception {
    samples.expectnew.ExpectNewDemo tested = new samples.expectnew.ExpectNewDemo();
    final java.lang.String expectedFailMessage = "testing";
    org.powermock.api.mockito.PowerMockito.whenNew(samples.newmocking.MyClass.class).withNoArguments().thenThrow(new java.lang.RuntimeException(expectedFailMessage));
    try {
        tested.throwExceptionWhenInvoction();
        org.junit.Assert.fail("Should throw RuntimeException!");
    } catch (java.lang.RuntimeException e) {
        org.junit.Assert.assertEquals(expectedFailMessage, e.getMessage());
    }
    org.powermock.api.mockito.PowerMockito.verifyNew(samples.newmocking.MyClass.class).withNoArguments();
}