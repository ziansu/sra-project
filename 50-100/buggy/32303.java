public static io.jenkins.blueocean.rest.impl.pipeline.BranchImpl.PullRequest get(final hudson.model.Job job) {
    try {
        return Caches.PULL_REQUEST_METADATA.get(job.getFullName()).orNull();
    } catch (java.util.concurrent.ExecutionException e) {
        throw new io.jenkins.blueocean.commons.ServiceException.UnexpectedErrorException((("loading pr metadata for '" + (job.getFullName())) + "'"), e);
    }
}