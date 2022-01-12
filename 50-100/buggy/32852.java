@java.lang.Override
public void addArtifacts(java.lang.String configuration, java.lang.Iterable<? extends org.gradle.api.artifacts.PublishArtifact> artifacts) {
    for (org.gradle.api.artifacts.PublishArtifact artifact : artifacts) {
        org.gradle.internal.component.external.model.MDArtifact ivyArtifact = getOrCreate(org.gradle.internal.component.model.DefaultIvyArtifactName.forPublishArtifact(artifact, getId().getName()));
        ivyArtifact.addConfiguration(configuration);
        addArtifact(ivyArtifact, artifact.getFile());
    }
}