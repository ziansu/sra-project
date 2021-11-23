protected com.atlassian.stash.util.Page<networkservlet.Branch> getBranches(networkservlet.Repository repository) {
    long startTime = java.lang.System.currentTimeMillis();
    com.atlassian.stash.util.PageRequest pageRequest = com.atlassian.stash.util.PageUtils.newRequest(0, 100);
    networkservlet.RepositoryBranchesRequest branchRequest = new networkservlet.RepositoryBranchesRequest.Builder().repository(repository).build();
    com.atlassian.stash.util.Page<networkservlet.Branch> branches = repositoryMetadataService.getBranches(branchRequest, pageRequest);
    return branches;
}