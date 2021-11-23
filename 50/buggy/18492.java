@java.lang.SuppressWarnings(value = "unchecked")
public boolean getIsAirProject() {
    return (getDependency(net.flexmojos.oss.matcher.artifact.ArtifactMatcher.groupId(net.flexmojos.oss.plugin.AbstractMavenMojo.AIR_GROUP_ID), net.flexmojos.oss.matcher.artifact.ArtifactMatcher.artifactId(net.flexmojos.oss.plugin.AbstractMavenMojo.AIR_GLOBAL), net.flexmojos.oss.matcher.artifact.ArtifactMatcher.type(net.flexmojos.oss.plugin.SWC))) != null;
}