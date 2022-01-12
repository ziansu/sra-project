public final <T, V> T invokeWithTypes(ANY instance, java.lang.String methodName, java.lang.Class[] paramTypes, V... args) {
    final int index = indexOfMethod(null, methodName, paramTypes);
    return invokeWithIndex(instance, index, args);
}