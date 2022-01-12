private boolean exists(java.util.List<?> dependencies, org.apache.maven.artifact.Artifact depArtifact) {
    boolean result = false;
    for (java.lang.Object dep : dependencies) {
        if (org.automagic.deps.doctor.Utils.reflectionEquals(dep, depArtifact, "groupId", "artifactId")) {
            result = true;
        }
    }
    return result;
}