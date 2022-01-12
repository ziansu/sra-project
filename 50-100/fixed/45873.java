protected org.openedit.repository.Repository createRepo(java.lang.String inType) {
    org.openedit.repository.Repository repo;
    if ("version".equals(inType)) {
        repo = new org.openedit.repository.filesystem.XmlVersionRepository();
        repo.setRepositoryType("versionRepository");
    }else
        if ("s3".equals(inType)) {
            repo = new org.openedit.repository.filesystem.XmlVersionRepository();
            repo.setRepositoryType("versionRepository");
        }else {
            repo = new org.openedit.repository.filesystem.FileRepository();
        }
    
    return repo;
}