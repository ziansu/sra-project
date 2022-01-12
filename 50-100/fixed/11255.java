private static <D extends org.jetbrains.kotlin.resolve.CallableDescriptor> void collectAllOverriddenDescriptors(@org.jetbrains.annotations.NotNull
D current, @org.jetbrains.annotations.NotNull
java.util.Set<D> result) {
    if (result.contains(current))
        return ;
    
    for (org.jetbrains.kotlin.resolve.CallableDescriptor callableDescriptor : current.getOriginal().getOverriddenDescriptors()) {
        @java.lang.SuppressWarnings(value = "unchecked")
        D descriptor = ((D) (callableDescriptor.getOriginal()));
        org.jetbrains.kotlin.resolve.DescriptorUtils.collectAllOverriddenDescriptors(descriptor, result);
        result.add(descriptor);
    }
}