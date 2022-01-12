private org.eclipse.tycho.ArtifactKey resolveRequirementReference(org.eclipse.tycho.artifacts.TargetPlatform targetPlatform, java.lang.String name, java.lang.String version, java.lang.String xml) throws org.apache.maven.plugin.MojoFailureException {
    try {
        return targetPlatform.resolveArtifact(ArtifactType.TYPE_INSTALLABLE_UNIT, name, version);
    } catch (org.eclipse.tycho.artifacts.IllegalArtifactReferenceException e) {
        throw new org.apache.maven.plugin.MojoFailureException(("Can't resolve reference " + xml));
    }
}