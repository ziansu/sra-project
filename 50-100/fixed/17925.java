@java.lang.Override
public void addValue(final java.lang.String name, final int value, final java.lang.String description) {
    final org.opendaylight.yangtools.binding.generator.util.generated.type.builder.EnumerationBuilderImpl.EnumPairImpl p = new org.opendaylight.yangtools.binding.generator.util.generated.type.builder.EnumerationBuilderImpl.EnumPairImpl(name, value, description);
    values = org.opendaylight.yangtools.util.LazyCollections.lazyAdd(values, p);
    unmodifiableValues = java.util.Collections.unmodifiableList(values);
}