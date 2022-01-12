public void restart(org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.DependencyGraphBuilder.ComponentState selected) {
    if ((this.selected) != selected) {
        select(selected);
        doRestart(selected);
    }
}