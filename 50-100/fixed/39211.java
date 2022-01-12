public static <T extends java.lang.Enum<T>> T valueOfIgnoreCase(java.lang.Class<T> enumeration, java.lang.String name) {
    for (T enumValue : enumeration.getEnumConstants()) {
        if (enumValue.name().equalsIgnoreCase(name)) {
            return enumValue;
        }
    }
    return null;
}