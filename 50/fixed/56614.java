@java.lang.SuppressWarnings(value = "rawtypes")
private static com.google.common.collect.ImmutableSet copyOfEnumSet(java.util.EnumSet enumSet) {
    return com.google.common.collect.ImmutableEnumSet.asImmutable(java.util.EnumSet.copyOf(enumSet));
}