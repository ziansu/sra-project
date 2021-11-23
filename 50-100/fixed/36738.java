public static <E> E[] getArrayInstance(E[] array, int length) throws java.lang.IllegalArgumentException {
    if (0 > length) {
        throw new java.lang.IllegalArgumentException();
    }
    java.lang.Class<?> arrayClass = array.getClass().getComponentType();
    @java.lang.SuppressWarnings(value = "unchecked")
    E[] newArray = ((E[]) (java.lang.reflect.Array.newInstance(arrayClass, length)));
    return newArray;
}