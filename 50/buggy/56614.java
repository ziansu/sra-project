private static <E extends java.lang.Enum<E>> com.google.common.collect.ImmutableSet<E> copyOfEnumSet(java.util.EnumSet<E> enumSet) {
    return com.google.common.collect.ImmutableEnumSet.asImmutable(java.util.EnumSet.copyOf(enumSet));
}