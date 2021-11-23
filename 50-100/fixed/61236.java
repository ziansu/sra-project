public static boolean isAssignableTo(java.lang.Object obj, java.lang.Class<?> type) {
    org.junit.gen5.commons.util.Preconditions.notNull(type, "type must not be null");
    if (obj == null) {
        return !(type.isPrimitive());
    }
    if (type.isInstance(obj)) {
        return true;
    }
    if (type.isPrimitive()) {
        return (org.junit.gen5.commons.util.ReflectionUtils.primitiveToWrapperMap.get(type)) == (obj.getClass());
    }
    return false;
}