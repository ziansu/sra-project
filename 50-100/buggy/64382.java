protected com.atlassian.stash.util.Page<networkservlet.Branch> getBranches(networkservlet.Repository repository) {
    long startTime = java.lang.System.currentTimeMillis();
    com.atlassian.stash.util.PageRequest pageRequest = com.atlassian.stash.util.PageUtils.newRequest(0, 100);
    networkservlet.RepositoryBranchesRequest branchRequest = new networkservlet.RepositoryBranchesRequest.Builder().repository(repository).build();
    com.atlassian.stash.util.Page<networkservlet.Branch> branches = repositoryMetadataService.getBranches(branchRequest, pageRequest);
    java.lang.System.out.println(((" Branch listing time: " + (java.lang.String.valueOf(((java.lang.System.currentTimeMillis()) - startTime)))) + "ms"));
    return branches;
}