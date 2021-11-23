@org.junit.Test
public void testSimpleMultipleNew_tooFewTimesExpected() throws java.lang.Exception {
    samples.expectnew.ExpectNewDemo tested = new samples.expectnew.ExpectNewDemo();
    samples.newmocking.MyClass myClassMock1 = org.powermock.api.mockito.PowerMockito.mock(samples.newmocking.MyClass.class);
    org.powermock.api.mockito.PowerMockito.whenNew(samples.newmocking.MyClass.class).withNoArguments().thenReturn(myClassMock1);
    tested.simpleMultipleNew();
    try {
        org.powermock.api.mockito.PowerMockito.verifyNew(samples.newmocking.MyClass.class, org.mockito.Mockito.times(1)).withNoArguments();
        org.junit.Assert.fail("Should throw AssertionError.");
    } catch (java.lang.AssertionError e) {
        org.junit.Assert.assertEquals("samples.newmocking.MyClass();\nWanted 1 time but was 3 times.", e.getMessage());
    }
}