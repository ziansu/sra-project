protected com.atlassian.stash.util.Page<? extends networkservlet.Tag> getTags(networkservlet.Repository repository) {
    long startTime = java.lang.System.currentTimeMillis();
    com.atlassian.stash.util.PageRequest pageRequest = com.atlassian.stash.util.PageUtils.newRequest(0, 100);
    com.atlassian.stash.util.Page<? extends networkservlet.Tag> tags = repositoryMetadataService.getTags(repository, pageRequest, "", null);
    return tags;
}