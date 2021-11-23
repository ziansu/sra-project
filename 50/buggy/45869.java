public org.eclipse.emf.emfstore.internal.client.model.ProjectSpace createLocalProject(java.lang.String projectName) {
    return cloneProject(projectName, org.eclipse.emf.emfstore.internal.common.model.ModelFactory.eINSTANCE.createProject());
}