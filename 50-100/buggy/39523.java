@org.junit.Test
public void testExpectNewButNoNewCallWasMade() throws java.lang.Exception {
    samples.expectnew.ExpectNewDemo tested = new samples.expectnew.ExpectNewDemo();
    samples.newmocking.MyClass myClassMock1 = org.powermock.api.mockito.PowerMockito.mock(samples.newmocking.MyClass.class);
    org.powermock.api.mockito.PowerMockito.whenNew(samples.newmocking.MyClass.class).withNoArguments().thenReturn(myClassMock1);
    tested.makeDate();
    try {
        org.powermock.api.mockito.PowerMockito.verifyNew(samples.newmocking.MyClass.class).withNoArguments();
        org.junit.Assert.fail("Should throw AssertionError!");
    } catch (java.lang.AssertionError e) {
        org.junit.Assert.assertEquals("Wanted but not invoked samples.newmocking.MyClass();\nActually, there were zero interactions with this mock.", e.getMessage());
    }
}