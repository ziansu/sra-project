@java.lang.SuppressWarnings(value = "unchecked")
protected org.apache.maven.artifact.Artifact getFrameworkConfig() {
    org.hamcrest.Matcher<? extends org.apache.maven.artifact.Artifact>[] frmkCfgMatchers = new org.hamcrest.Matcher[]{ groupId(getFrameworkGroupId()) , artifactId("framework") , classifier("configs") , type("zip") };
    org.apache.maven.artifact.Artifact frmkCfg = getDependency(frmkCfgMatchers);
    if (frmkCfg == null) {
        frmkCfg = resolve(getFrameworkGroupId(), "framework", getFrameworkArtifactVersion(getFrameworkGroupId(), "framework"), "configs", "zip");
    }
    return frmkCfg;
}