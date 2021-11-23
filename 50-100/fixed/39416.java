public void addProject(java.lang.String projectName) {
    final com.blackducksoftware.integration.hub.buildtool.Gav[] gavs = projService.getMavenAndGradleDependencies(projectName);
    final java.util.Map<com.blackducksoftware.integration.hub.buildtool.Gav, com.blackducksoftware.integration.eclipseplugin.internal.DependencyInfo> deps = new java.util.concurrent.ConcurrentHashMap<>();
    for (final com.blackducksoftware.integration.hub.buildtool.Gav gav : gavs) {
        try {
            deps.put(gav, componentCache.getCache().get(gav));
        } catch (final java.util.concurrent.ExecutionException e) {
        }
    }
    projectInfo.put(projectName, deps);
}