public static <D extends org.jetbrains.kotlin.resolve.CallableDescriptor> boolean overrides(@org.jetbrains.annotations.NotNull
D f, @org.jetbrains.annotations.NotNull
D g) {
    if ((!(f.equals(g))) && (DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(f.getOriginal(), g.getOriginal())))
        return true;
    
    org.jetbrains.kotlin.resolve.CallableDescriptor originalG = g.getOriginal();
    for (D overriddenFunction : org.jetbrains.kotlin.resolve.DescriptorUtils.getAllOverriddenDescriptors(f)) {
        if (DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(originalG, overriddenFunction))
            return true;
        
    }
    return false;
}