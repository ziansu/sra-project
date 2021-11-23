@java.lang.SuppressWarnings(value = "unchecked")
protected org.apache.maven.artifact.Artifact getFrameworkConfig() {
    org.hamcrest.Matcher<? extends org.apache.maven.artifact.Artifact>[] frmkCfgMatchers = new org.hamcrest.Matcher[]{ net.flexmojos.oss.matcher.artifact.ArtifactMatcher.groupId(getFrameworkGroupId()) , net.flexmojos.oss.matcher.artifact.ArtifactMatcher.artifactId("framework") , net.flexmojos.oss.matcher.artifact.ArtifactMatcher.classifier("configs") , net.flexmojos.oss.matcher.artifact.ArtifactMatcher.type("zip") };
    org.apache.maven.artifact.Artifact frmkCfg = getDependency(frmkCfgMatchers);
    if (frmkCfg == null) {
        frmkCfg = resolve(getFrameworkGroupId(), "framework", getFrameworkArtifactVersion(getFrameworkGroupId(), "framework"), "configs", "zip");
    }
    return frmkCfg;
}