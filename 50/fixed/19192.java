public static void addBaseType(java.lang.Class<?> clazz) {
    if (null == clazz) {
        throw new java.lang.NullPointerException();
    }
    org.fintx.util.Objects.BASE_TYPES.add(clazz);
}