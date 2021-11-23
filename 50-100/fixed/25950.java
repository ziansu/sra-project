public static <T> T[] toArray(java.util.Collection<T> collection, java.lang.Class<T> arrayComponentType) {
    if (null == collection) {
        return null;
    }
    org.apache.commons.lang3.Validate.notNull(arrayComponentType, "arrayComponentType must not be null");
    T[] array = com.feilong.core.lang.ArrayUtil.newArray(arrayComponentType, collection.size());
    return collection.toArray(array);
}