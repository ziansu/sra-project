public static java.lang.reflect.Method getReflectedMethod(java.lang.String methodName, main.java.HashTable instance) throws test.java.HashTableTests.HashTableUtilException {
    java.lang.Class hashTableClass = instance.getClass();
    java.lang.Class[] methodParameter = new java.lang.Class[1];
    methodParameter[0] = java.lang.String.class;
    try {
        return hashTableClass.getDeclaredMethod(methodName, methodParameter);
    } catch (java.lang.NoSuchMethodException e) {
        throw new test.java.HashTableTests.HashTableUtilException(("Failed to reflect " + methodName));
    }
}