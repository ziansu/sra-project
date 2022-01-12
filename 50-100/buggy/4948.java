public void prepare() throws java.io.IOException {
    java.io.File repositoryFolder = new java.io.File(repository.getPath());
    java.lang.String tempRepository = org.repositoryminer.utility.FileUtils.copyFolderToTmp(repositoryFolder.getAbsolutePath(), repository.getName());
    scm = org.repositoryminer.scm.SCMFactory.getSCM(repository.getScm());
    scm.open(tempRepository);
    cpdExecutor = new org.repositoryminer.pmd.cpd.CPDExecutor(tempRepository);
}