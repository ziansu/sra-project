private static boolean isIntegerNumber(java.lang.Number number) {
    java.lang.Class<?> numberClass = number.getClass();
    return (((java.lang.Byte.class.isAssignableFrom(numberClass)) || (java.lang.Short.class.isAssignableFrom(numberClass))) || (java.lang.Integer.class.isAssignableFrom(numberClass))) || (java.lang.Long.class.isAssignableFrom(numberClass));
}