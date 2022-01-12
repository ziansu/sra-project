public static <T, E extends java.lang.Enum<E>> java.util.Map<E, T> convertToSimpleEnumMap(final java.util.Map<T, E> map) {
    com.ikueb.revemap.EnumMapUtils.validateArguments(map);
    return new java.util.EnumMap<E, T>(com.ikueb.revemap.EnumMapUtils.doMap(map.entrySet(), java.util.Map.Entry::getValue, java.util.Map.Entry::getKey, false));
}