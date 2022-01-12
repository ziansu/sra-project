public static java.lang.Object getReflectedField(java.lang.String fieldName, main.java.HashTable instance) throws test.java.HashTableTests.HashTableUtilException {
    java.lang.Class hashTableClass = instance.getClass();
    try {
        java.lang.reflect.Field field = hashTableClass.getDeclaredField(fieldName);
        field.setAccessible(true);
        return field.get(instance);
    } catch (java.lang.NoSuchFieldException | java.lang.IllegalAccessException e) {
        throw new test.java.HashTableTests.HashTableUtilException(("Failed to retrieve " + fieldName));
    }
}