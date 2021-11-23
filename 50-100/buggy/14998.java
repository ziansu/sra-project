public final <T, V> T invoke(ANY instance, java.lang.String methodName, V... args) {
    final int index = indexOfMethod(null, methodName, com.esotericsoftware.reflectasm.ClassAccess.args2Types(args));
    return invokeWithIndex(((!(methodName.equals(com.esotericsoftware.reflectasm.ClassAccess.NEW))) && (java.lang.reflect.Modifier.isStatic(classInfo.methodModifiers[index])) ? null : instance), index, args);
}