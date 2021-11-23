@java.lang.Override
public org.eclipse.core.runtime.IStatus addArtifactRepository(java.net.URI location) {
    try {
        getArtifactRepositoryManager().loadRepository(location, null);
        return new org.eclipse.ecf.core.status.SerializableStatus(org.eclipse.core.runtime.Status.OK_STATUS);
    } catch (org.eclipse.equinox.p2.core.ProvisionException e) {
    }
    java.lang.String repositoryName = location + " - metadata";
    try {
        getArtifactRepositoryManager().createRepository(location, repositoryName, IArtifactRepositoryManager.TYPE_SIMPLE_REPOSITORY, null);
        return new org.eclipse.ecf.core.status.SerializableStatus(org.eclipse.core.runtime.Status.OK_STATUS);
    } catch (org.eclipse.equinox.p2.core.ProvisionException e) {
        return createErrorStatus("Cannot add artifact repository", e);
    }
}