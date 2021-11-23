public void updateDependencies(java.util.Collection<org.clarent.ivyidea.resolve.dependency.ResolvedDependency> resolvedDependencies) {
    removeDependenciesNotInList(resolvedDependencies);
    for (org.clarent.ivyidea.resolve.dependency.ResolvedDependency resolvedDependency : resolvedDependencies) {
        resolvedDependency.addTo(this);
    }
}