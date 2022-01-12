@org.junit.Test
public void testSimpleMultipleNewPrivate_ok() throws java.lang.Exception {
    samples.expectnew.ExpectNewDemo tested = new samples.expectnew.ExpectNewDemo();
    samples.newmocking.MyClass myClassMock1 = org.powermock.api.mockito.PowerMockito.mock(samples.newmocking.MyClass.class);
    org.powermock.api.mockito.PowerMockito.whenNew(samples.newmocking.MyClass.class).withNoArguments().thenReturn(myClassMock1);
    org.powermock.reflect.Whitebox.invokeMethod(tested, "simpleMultipleNewPrivate");
    org.powermock.api.mockito.PowerMockito.verifyNew(samples.newmocking.MyClass.class, org.mockito.Mockito.times(3)).withNoArguments();
}