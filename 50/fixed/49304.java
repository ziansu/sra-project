@java.lang.Override
public java.lang.Object answer(org.mockito.invocation.InvocationOnMock invocation) throws java.lang.Throwable {
    java.lang.reflect.Method method = invocation.getMethod();
    if (nl.jssl.autounit.inputs.objects.ObjectArgumentFactory.returnsVoid(method)) {
        return java.lang.Void.TYPE.toString();
    }
    return null;
}