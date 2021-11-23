protected boolean rebuildMetadata(java.lang.String site) {
    java.lang.String firstCommitId = contentRepository.getRepoFirstCommitId(site);
    siteService.syncDatabaseWithRepo(site, firstCommitId);
    return true;
}