public void push(org.alien4cloud.tosca.model.Csar csar, java.lang.String username, java.lang.String password, java.lang.String remoteBranch) {
    java.nio.file.Path archiveGitPath = csarRepositry.getExpandedCSAR(csar.getName(), csar.getVersion());
    alien4cloud.git.RepositoryManager.push(archiveGitPath, username, password, remoteBranch);
}