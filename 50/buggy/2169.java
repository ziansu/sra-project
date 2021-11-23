private static org.opendaylight.mdsal.binding.javav2.model.api.Type referencedType(final java.lang.Class<?> type) {
    return new org.opendaylight.mdsal.binding.javav2.generator.util.ReferencedTypeImpl(type.getPackage().getName(), type.getSimpleName());
}