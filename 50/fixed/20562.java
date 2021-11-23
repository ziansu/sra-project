public void logOffProject() {
    repositoryFactoryFromProvider.logOffProject();
    org.talend.core.repository.model.ProjectRepositoryNode root = org.talend.core.repository.model.ProjectRepositoryNode.getInstance();
    if (root != null) {
        root.setEnableDisposed(true);
        root.dispose();
    }
    fullLogonFinished = false;
}