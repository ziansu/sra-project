@java.lang.SuppressWarnings(value = "rawtypes")
private void emitAugmentation(final java.lang.Class type, final org.opendaylight.yangtools.yang.binding.Augmentation<?> value, final org.opendaylight.yangtools.yang.binding.BindingStreamEventWriter stream, final org.opendaylight.yangtools.yang.binding.DataObjectSerializerRegistry registry) throws java.io.IOException {
    com.google.common.base.Preconditions.checkArgument((value instanceof org.opendaylight.yangtools.yang.binding.DataObject));
    @java.lang.SuppressWarnings(value = "unchecked")
    org.opendaylight.yangtools.yang.binding.DataObjectSerializer serializer = registry.getSerializer(type);
    if (serializer != null) {
        serializer.serialize(((org.opendaylight.yangtools.yang.binding.DataObject) (value)), stream);
    }else {
        org.opendaylight.yangtools.binding.data.codec.util.AugmentableDispatchSerializer.LOG.warn("DataObjectSerializer is not present for {} in registry {}", type, registry);
    }
}