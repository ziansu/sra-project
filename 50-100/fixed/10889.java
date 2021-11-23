@org.junit.Test
public void testSimpleSingleNew_withOnce() throws java.lang.Exception {
    samples.expectnew.ExpectNewDemo tested = new samples.expectnew.ExpectNewDemo();
    samples.newmocking.MyClass myClassMock1 = mock(samples.newmocking.MyClass.class);
    whenNew(samples.newmocking.MyClass.class).withNoArguments().thenReturn(myClassMock1);
    tested.simpleSingleNew();
    verifyNew(samples.newmocking.MyClass.class).withNoArguments();
}