@org.junit.Test
public void testSimpleMultipleNew_tooManyTimesExpected() throws java.lang.Exception {
    samples.expectnew.ExpectNewDemo tested = new samples.expectnew.ExpectNewDemo();
    samples.newmocking.MyClass myClassMock = mock(samples.newmocking.MyClass.class);
    whenNew(samples.newmocking.MyClass.class).withNoArguments().thenReturn(myClassMock);
    tested.simpleMultipleNew();
    try {
        verifyNew(samples.newmocking.MyClass.class, org.mockito.Mockito.times(4)).withNoArguments();
        org.junit.Assert.fail("Should throw AssertionError.");
    } catch (java.lang.AssertionError e) {
        org.junit.Assert.assertEquals("samples.newmocking.MyClass();\nWanted 4 times but was 3 times.", e.getMessage());
    }
}