public boolean add(final T dependency) {
    mFoundDependencies.put(dependency.getClass(), dependency);
    return (mMode) == (com.robopupu.api.dependency.DependencyQuery.Mode.FIRST_MATCHING_DEPENDENCY);
}