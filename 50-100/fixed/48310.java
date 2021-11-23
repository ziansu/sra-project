public static <T> int calculateNonPrimitiveArraySize(T[] objects) {
    int totalSize = (objects.length) + 4;
    for (T object : objects) {
        if (object != null) {
            final java.lang.reflect.Field[] fields = org.vaslabs.vserializer.SerializationUtils.getAllFields(object);
            final int sizeOfSingleObject = org.vaslabs.vserializer.SerializationUtils.calculateSize(fields, object);
            totalSize += sizeOfSingleObject;
        }
    }
    return totalSize;
}