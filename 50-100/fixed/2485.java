@org.junit.Test
public void testSpy() {
    owo.com.androidunittest.targets.A a = new owo.com.androidunittest.targets.A();
    a = org.mockito.Mockito.spy(a);
    org.mockito.Mockito.when(a.publicMethod()).thenReturn("mockA");
    junit.framework.Assert.assertEquals("mockA", a.publicMethod());
    junit.framework.Assert.assertEquals("publicMethod2", a.publicMethod2());
    org.mockito.Mockito.verify(a, org.mockito.Mockito.times(1)).publicMethod();
}