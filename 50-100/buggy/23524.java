static <E extends java.lang.Enum<E>> com.google.common.collect.ImmutableSet<E> asImmutable(java.util.EnumSet<E> set) {
    switch (set.size()) {
        case 0 :
            return com.google.common.collect.ImmutableSet.of();
        case 1 :
            return com.google.common.collect.ImmutableSet.of(com.google.common.collect.Iterables.getOnlyElement(set));
        default :
            return new com.google.common.collect.ImmutableEnumSet<E>(set);
    }
}