private boolean isOsgiReady(org.eclipse.aether.artifact.Artifact artifact) throws java.lang.Exception {
    java.util.jar.JarFile jar = new java.util.jar.JarFile(artifact.getFile());
    java.util.jar.Attributes attrs = jar.getManifest().getMainAttributes();
    return ((attrs.getValue("Bundle-SymbolicName")) != null) && ((attrs.getValue("Bundle-Version")) != null);
}