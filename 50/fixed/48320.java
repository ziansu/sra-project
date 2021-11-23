public static boolean isWrapperType(java.lang.Class<?> clazz) {
    if (null == clazz) {
        throw new java.lang.NullPointerException();
    }
    return org.fintx.util.Objects.WRAPPER_TYPES.contains(clazz);
}