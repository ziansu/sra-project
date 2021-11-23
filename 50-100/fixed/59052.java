@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public <DV extends org.opendaylight.yangtools.yang.binding.DataObject> org.opendaylight.yangtools.binding.data.codec.impl.DataContainerCodecContext<DV, ?> streamChild(final java.lang.Class<DV> childClass) {
    final org.opendaylight.yangtools.binding.data.codec.impl.DataContainerCodecPrototype<?> child = byClass.get(childClass);
    return ((org.opendaylight.yangtools.binding.data.codec.impl.DataContainerCodecContext<DV, ?>) (childNonNull(child, childClass, "Supplied class %s is not valid case", childClass).get()));
}