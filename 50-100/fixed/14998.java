public final <T, V> T invoke(ANY instance, java.lang.String methodName, V... args) {
    final int index = indexOfMethod(null, methodName, com.esotericsoftware.reflectasm.ClassAccess.args2Types(args));
    return invokeWithIndex(instance, index, args);
}