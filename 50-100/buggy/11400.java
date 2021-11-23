@org.junit.Test
public void testMock() {
    owo.com.androidunittest.targets.A a = org.mockito.Mockito.mock(owo.com.androidunittest.targets.A.class);
    org.mockito.Mockito.when(a.publicMethod()).thenReturn("mockA");
    junit.framework.Assert.assertEquals("mockA", a.publicMethod());
    org.mockito.Mockito.verify(a, org.mockito.Mockito.times(0)).publicMethod();
    org.mockito.Mockito.verify(a, org.mockito.Mockito.never()).foo();
}