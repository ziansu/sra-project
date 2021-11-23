public static <T> T getValue(java.lang.Class<?> cls, boolean remove) {
    java.lang.String key = cls.getName();
    T t = ((T) (MyApplication.mInstance.loadObject(key, remove)));
    return t;
}