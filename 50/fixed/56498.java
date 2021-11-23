public java.lang.String calculateReleaseVersion(java.lang.String fromVersion) {
    java.lang.String releaseVersion;
    try {
        releaseVersion = new org.jfrog.hudson.util.GenericArtifactVersion(fromVersion).setBuildSpecifier(null).toString();
    } catch (java.lang.IllegalArgumentException e) {
        releaseVersion = fromVersion;
    }
    return releaseVersion;
}