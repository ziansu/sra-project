public static io.jenkins.blueocean.rest.impl.pipeline.BranchImpl.Branch getBranch(final hudson.model.Job job) {
    try {
        return Caches.BRANCH_METADATA.get(job.getFullName());
    } catch (java.util.concurrent.ExecutionException e) {
        throw new io.jenkins.blueocean.commons.ServiceException.UnexpectedErrorException((("loading branch metadata for '" + (job.getFullName())) + "'"), e);
    }
}