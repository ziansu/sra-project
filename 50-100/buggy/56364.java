public static <E extends java.lang.Enum<E>> E byValue(java.lang.Class<E> EClass, java.lang.String enumValue, E defaultOption) {
    try {
        return java.lang.Enum.valueOf(EClass, enumValue);
    } catch (java.lang.IllegalArgumentException e) {
        if (defaultOption != null) {
            return defaultOption;
        }
    }
    return null;
}