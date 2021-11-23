protected org.openedit.repository.Repository createRepo(java.lang.String inType) {
    org.openedit.repository.Repository repo;
    if (inType == "version") {
        repo = new org.openedit.repository.filesystem.XmlVersionRepository();
        repo.setRepositoryType("versionRepository");
    }else
        if (inType == "s3") {
            repo = new org.openedit.repository.filesystem.XmlVersionRepository();
            repo.setRepositoryType("versionRepository");
        }else {
            repo = new org.openedit.repository.filesystem.FileRepository();
        }
    
    return repo;
}