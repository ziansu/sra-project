public static <E extends java.lang.Enum<E>> E byValue(java.lang.Class<E> EClass, java.lang.String enumValue, E defaultOption) {
    try {
        return enumValue != null ? java.lang.Enum.valueOf(EClass, enumValue) : defaultOption;
    } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException e) {
        return defaultOption;
    }
}