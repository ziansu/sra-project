public void delete(org.eclipse.core.runtime.IProgressMonitor monitor) throws java.io.IOException {
    org.eclipse.emf.emfstore.internal.client.model.ESWorkspaceProviderImpl.getObserverBus().notify(org.eclipse.emf.emfstore.internal.client.observers.DeleteProjectSpaceObserver.class).projectSpaceDeleted(this);
    getProject().delete();
    deleteResource(getProject().eResource());
    deleteResource(eResource());
    org.eclipse.emf.emfstore.internal.client.model.ESWorkspaceProviderImpl.getInstance().getInternalWorkspace().getProjectSpaces().remove(this);
    dispose();
}