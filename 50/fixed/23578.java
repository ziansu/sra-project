public static <T extends java.lang.Enum> java.util.List<T> getAllEnumValues(T enumValue) {
    return java.util.Arrays.asList(((T[]) (enumValue.getDeclaringClass().getEnumConstants())));
}