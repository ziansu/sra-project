public static <T> T getValue(java.lang.String key, boolean remove) {
    T t = ((T) (MyApplication.mInstance.loadObject(key, remove)));
    return t;
}