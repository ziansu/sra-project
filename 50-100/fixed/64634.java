@org.junit.Test(expected = java.lang.IllegalStateException.class)
public void testArgumentIncompatibleTooMany() throws java.lang.Exception {
    instrument(net.bytebuddy.instrumentation.MethodCallTest.InstanceMethod.class, net.bytebuddy.instrumentation.MethodCall.invoke(net.bytebuddy.instrumentation.MethodCallTest.StaticIncompatibleExternalMethod.class.getDeclaredMethod("bar", java.lang.String.class)).with(net.bytebuddy.instrumentation.MethodCallTest.FOO, net.bytebuddy.instrumentation.MethodCallTest.BAR), net.bytebuddy.instrumentation.MethodCallTest.InstanceMethod.class.getClassLoader(), named(net.bytebuddy.instrumentation.MethodCallTest.FOO));
}