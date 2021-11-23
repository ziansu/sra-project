@java.lang.Override
public boolean supports(java.lang.Class<? extends org.spongepowered.api.data.manipulator.ImmutableDataManipulator<?, ?>> containerClass) {
    for (org.spongepowered.api.data.manipulator.ImmutableDataManipulator<?, ?> manipulator : this.manipulators) {
        if (containerClass.isInstance(manipulator)) {
            return true;
        }
    }
    final com.google.common.base.Optional<org.spongepowered.common.data.DataProcessor> processorOptional = org.spongepowered.common.data.SpongeDataRegistry.getInstance().getWildImmutableProcessor(containerClass);
    return (processorOptional.isPresent()) && (processorOptional.get().supports(this.entityType));
}