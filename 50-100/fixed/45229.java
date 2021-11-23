public static boolean isPrimitiveOrStringOrWrapperOrBigDecimal(java.lang.Object obj) {
    java.lang.Class clazz = obj.getClass();
    return ((((clazz.isPrimitive()) || ((java.lang.String.class) == clazz)) || ((java.lang.Character.class) == clazz)) || ((java.lang.Boolean.class) == clazz)) || (java.lang.Number.class.isAssignableFrom(clazz));
}