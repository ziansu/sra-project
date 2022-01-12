private void downloadMetadataConcurrently(org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.DependencyGraphBuilder.ConfigurationNode node, final java.util.List<org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.DependencyGraphBuilder.DependencyEdge> dependencies) {
    if (dependencies.isEmpty()) {
        return ;
    }
    org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.DependencyGraphBuilder.LOGGER.debug("Submitting {} metadata files to resolve in parallel for {}", dependencies.size(), node);
    buildOperationExecutor.runAll(new org.gradle.api.Action<org.gradle.internal.operations.BuildOperationQueue<org.gradle.internal.operations.RunnableBuildOperation>>() {
        @java.lang.Override
        public void execute(org.gradle.internal.operations.BuildOperationQueue<org.gradle.internal.operations.RunnableBuildOperation> buildOperationQueue) {
            for (final org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.DependencyGraphBuilder.DependencyEdge dependency : dependencies) {
                buildOperationQueue.add(new org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.DependencyGraphBuilder.DownloadMetadataOperation(dependency.targetModuleRevision));
            }
        }
    });
}