public static <T> T getValue(java.lang.String key, boolean remove) {
    return ((T) (MyApplication.mInstance.loadObject(key, remove)));
}