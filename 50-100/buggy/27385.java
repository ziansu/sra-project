private boolean exists(java.util.List<org.apache.maven.model.Dependency> dependencies, org.apache.maven.artifact.Artifact depArtifact) {
    boolean result = false;
    for (org.apache.maven.model.Dependency dep : dependencies) {
        if (org.automagic.deps.doctor.Utils.reflectionEquals(dep, depArtifact, "groupId", "artifactId")) {
            result = true;
        }
    }
    return result;
}