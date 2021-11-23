public boolean hasDependency(final java.lang.Class<?> dependencyType) {
    return (mDependencies.containsKey(dependencyType)) && (!(mDependencies.get(dependencyType).isEmpty()));
}