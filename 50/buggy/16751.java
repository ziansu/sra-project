public static it.eng.ontorepo.RepositoryDAO getRepoInstanceImpl(java.lang.Class<?> clazz) {
    it.eng.ontorepo.RepositoryDAO repoInstance = new it.eng.ontorepo.sesame2.Sesame2RepositoryDAO(it.eng.cam.rest.sesame.SesameRepoManager.SESAME_REPO_URL, it.eng.cam.rest.sesame.SesameRepoManager.SESAME_REPO_NAME, it.eng.cam.rest.sesame.SesameRepoManager.SESAME_REPO_NAMESPACE);
    it.eng.cam.rest.sesame.SesameRepoManager.addRdfFileToInstance(repoInstance, clazz, false);
    return repoInstance;
}