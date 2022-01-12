public static <T> int calculateNonPrimitiveArraySize(T[] objects) {
    final java.lang.reflect.Field[] fields = org.vaslabs.vserializer.SerializationUtils.getAllFields(objects[0]);
    final int sizeOfSingleObject = org.vaslabs.vserializer.SerializationUtils.calculateSize(fields, objects[0]);
    int totalSize = (objects.length) + 4;
    for (T object : objects) {
        if (object != null)
            totalSize += sizeOfSingleObject;
        
    }
    return totalSize;
}