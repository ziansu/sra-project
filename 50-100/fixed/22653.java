@org.junit.Test
public void testSimpleSingleNew_withAtLeastOnce() throws java.lang.Exception {
    samples.expectnew.ExpectNewDemo tested = new samples.expectnew.ExpectNewDemo();
    samples.newmocking.MyClass myClassMock1 = mock(samples.newmocking.MyClass.class);
    whenNew(samples.newmocking.MyClass.class).withNoArguments().thenReturn(myClassMock1);
    tested.simpleSingleNew();
    verifyNew(samples.newmocking.MyClass.class, org.mockito.Mockito.atLeastOnce()).withNoArguments();
}