private static boolean isFloatingPointNumber(java.lang.Class<?> numberClass) {
    return (java.lang.Float.class.isAssignableFrom(numberClass)) || (java.lang.Double.class.isAssignableFrom(numberClass));
}