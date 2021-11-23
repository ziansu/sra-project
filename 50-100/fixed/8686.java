private void cloneOriginRepository() throws java.io.IOException, org.eclipse.jgit.api.errors.GitAPIException, org.eclipse.jgit.api.errors.InvalidRemoteException, org.eclipse.jgit.api.errors.TransportException {
    gitRepo = org.eclipse.jgit.api.Git.cloneRepository().setURI(getOriginUrl()).setDirectory(createTempDirectory("TestGitRepo")).call();
    testTempRepo = gitRepo.getRepository().getDirectory();
}