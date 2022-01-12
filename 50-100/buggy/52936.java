public final <T, V> T invokeWithTypes(ANY instance, java.lang.String methodName, java.lang.Class[] paramTypes, V... args) {
    final int index = indexOfMethod(null, methodName, paramTypes);
    return invokeWithIndex(((!(methodName.equals(com.esotericsoftware.reflectasm.ClassAccess.NEW))) && (java.lang.reflect.Modifier.isStatic(classInfo.methodModifiers[index])) ? null : instance), index, args);
}