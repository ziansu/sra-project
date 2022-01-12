@java.lang.SuppressWarnings(value = "rawtypes")
static com.google.common.collect.ImmutableSet asImmutable(java.util.EnumSet set) {
    switch (set.size()) {
        case 0 :
            return com.google.common.collect.ImmutableSet.of();
        case 1 :
            return com.google.common.collect.ImmutableSet.of(com.google.common.collect.Iterables.getOnlyElement(set));
        default :
            return new com.google.common.collect.ImmutableEnumSet(set);
    }
}