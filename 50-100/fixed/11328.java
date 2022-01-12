public void clone(java.lang.String pathDest) {
    checkIfExist(pathDest);
    rc = new com.aragost.javahg.RepositoryConfiguration();
    if (java.lang.System.getProperty("os.name").toLowerCase().contains("windows")) {
        configureMercurial();
    }
    br = com.aragost.javahg.BaseRepository.clone(rc, new java.io.File(pathDest), org.cloudml.connectors.util.MercurialConnector.endPoint);
}