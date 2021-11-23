protected org.openrdf.repository.Repository createRepository() throws java.lang.Exception {
    try {
        sesameWrapper.SesameVirtualRepo repo = new sesameWrapper.SesameVirtualRepo(testURI, mappingFileURL, false, "TreeWitness");
        repo.initialize();
        return repo;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        throw e;
    }
}