@java.lang.Override
public java.lang.Object invoke(java.lang.Object o, java.lang.reflect.Method method, java.lang.Object[] objects) throws java.lang.Throwable {
    if (isValid(method)) {
        invokeMethod = method;
        if (objects != null) {
            invokeParameters = java.util.Arrays.copyOf(objects, objects.length);
        }else {
            invokeParameters = new java.lang.Object[0];
        }
    }else {
        throw new java.lang.RuntimeException((("Invalid class '" + (method.getDeclaringClass())) + "' can not wrapped for asynchronous processing."));
    }
    return extensionProcessor.process();
}