@org.junit.Test
public void testSimpleMultipleNew() throws java.lang.Exception {
    samples.expectnew.ExpectNewDemo tested = new samples.expectnew.ExpectNewDemo();
    samples.newmocking.MyClass myClassMock = mock(samples.newmocking.MyClass.class);
    whenNew(samples.newmocking.MyClass.class).withNoArguments().thenReturn(myClassMock);
    tested.simpleMultipleNew();
    verifyNew(samples.newmocking.MyClass.class, org.mockito.Mockito.times(3)).withNoArguments();
}