private org.jboss.tools.openshift.egit.internal.test.util.TestRepository cloneRepository(org.jboss.tools.openshift.egit.internal.test.util.TestRepository repository) throws java.io.IOException, java.lang.InterruptedException, java.lang.reflect.InvocationTargetException, java.net.URISyntaxException {
    java.io.File workspaceDir = org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile();
    java.io.File clonedRepositoryFile = new java.io.File(workspaceDir, ("clonedRepository-" + (java.lang.String.valueOf(java.lang.System.currentTimeMillis()))));
    return testRepository.cloneRepository(clonedRepositoryFile);
}