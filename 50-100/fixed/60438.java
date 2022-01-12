public java.lang.String submitJob(final com.netflix.genie.common.dto.JobRequest jobRequest) throws com.netflix.genie.client.exceptions.GenieClientException, java.io.IOException {
    if (jobRequest == null) {
        throw new java.lang.IllegalArgumentException("Job Request cannot be null.");
    }
    return getIdFromLocation(this.jobService.submitJob(jobRequest).execute().headers().get("location"));
}