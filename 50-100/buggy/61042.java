private boolean isBundle(final java.io.File artifactFile) {
    if ((!(artifactFile.getName().endsWith(".jar"))) || (!(artifactFile.exists()))) {
        return false;
    }
    final java.util.jar.Manifest manifest = loadManifest(artifactFile);
    if (manifest == null) {
        return false;
    }
    final java.lang.String symbolicName = ((java.lang.String) (manifest.getMainAttributes().get(net.distilledcode.maven.baselining.BaselineMojo.BUNDLE_SYMBOLIC_NAME)));
    return symbolicName != null;
}