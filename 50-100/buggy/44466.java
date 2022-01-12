@org.junit.Test
public void testSimpleMultipleNew() throws java.lang.Exception {
    samples.expectnew.ExpectNewDemo tested = new samples.expectnew.ExpectNewDemo();
    samples.newmocking.MyClass myClassMock = org.powermock.api.mockito.PowerMockito.mock(samples.newmocking.MyClass.class);
    org.powermock.api.mockito.PowerMockito.whenNew(samples.newmocking.MyClass.class).withNoArguments().thenReturn(myClassMock);
    tested.simpleMultipleNew();
    org.powermock.api.mockito.PowerMockito.verifyNew(samples.newmocking.MyClass.class, org.mockito.Mockito.times(3)).withNoArguments();
}