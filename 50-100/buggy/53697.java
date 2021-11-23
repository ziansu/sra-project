public static java.lang.Object execute(java.lang.String methodName, java.lang.String parameter, main.java.HashTable instance) throws test.java.HashTableTests.HashTableUtilException {
    try {
        java.lang.reflect.Method method = test.java.HashTableTests.HashTableTestUtilities.getReflectedMethod(methodName, instance);
        method.setAccessible(true);
        java.lang.Object[] callParameters = new java.lang.Object[]{ parameter };
        return method.invoke(instance, callParameters);
    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
        java.lang.System.out.println(e);
        throw new test.java.HashTableTests.HashTableUtilException(("Failed to execute " + methodName));
    }
}