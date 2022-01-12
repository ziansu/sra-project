@org.junit.Test
public void testSimpleMultipleNewPrivate_ok() throws java.lang.Exception {
    samples.expectnew.ExpectNewDemo tested = new samples.expectnew.ExpectNewDemo();
    samples.newmocking.MyClass myClassMock1 = mock(samples.newmocking.MyClass.class);
    whenNew(samples.newmocking.MyClass.class).withNoArguments().thenReturn(myClassMock1);
    org.powermock.reflect.Whitebox.invokeMethod(tested, "simpleMultipleNewPrivate");
    verifyNew(samples.newmocking.MyClass.class, org.mockito.Mockito.times(3)).withNoArguments();
}