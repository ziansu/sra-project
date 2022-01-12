public com.github.rinde.rinsim.core.Model<?> build() {
    if ((value) == null) {
        value = modelBuilder.build(dependencyProvider);
        com.google.common.base.Preconditions.checkNotNull(value, "%s returned null where a Model was expected.", modelBuilder);
        com.google.common.base.Preconditions.checkState(dependencyProvider.areAllDependenciesRequested(), ("All declared dependencies MUST be requested from the dependency " + "provider, %s has unused dependencies: %s."), modelBuilder, dependencyProvider.getUnusedDependencies());
    }
    return com.google.common.base.Verify.verifyNotNull(value);
}