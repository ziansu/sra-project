private java.io.File resolveRslDestination(java.lang.String rsl, org.apache.maven.artifact.Artifact artifact, java.lang.String extension) {
    rsl = replaceContextRoot(rsl);
    rsl = net.flexmojos.oss.plugin.utilities.MavenUtils.interpolateRslUrl(rsl, artifact, extension, null);
    return net.flexmojos.oss.util.PathUtil.file(rsl);
}