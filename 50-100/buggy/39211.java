public static <T extends java.lang.Enum<T>> T valueOfIgnoreCase(java.lang.Class<T> enumeration, java.lang.String name) {
    for (T enumValue : enumeration.getEnumConstants()) {
        if (enumValue.name().equalsIgnoreCase(name)) {
            return enumValue;
        }
    }
    throw new java.lang.IllegalArgumentException(((("There is no value with name '" + name) + " in Enum ") + (enumeration.getClass().getName())));
}