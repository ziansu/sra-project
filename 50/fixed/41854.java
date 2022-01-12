public java.util.Set<org.gradle.internal.component.local.model.ComponentArtifactMetaData> getArtifacts() {
    return org.gradle.internal.component.local.model.DefaultLocalComponentMetaData.getArtifacts(componentIdentifier, getHierarchy(), allArtifacts);
}