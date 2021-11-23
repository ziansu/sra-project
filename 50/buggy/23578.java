public static <T extends java.lang.Enum> java.util.List<T> getAllEnumValues(T enumValue) {
    return edu.emory.mathcs.backport.java.util.Arrays.asList(enumValue.getDeclaringClass().getEnumConstants());
}