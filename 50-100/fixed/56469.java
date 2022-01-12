private java.util.List<java.lang.String> getLedStripFromConfiguredJob(org.synyx.sybil.jenkins.domain.JenkinsJob job, java.util.List<org.synyx.sybil.jenkins.domain.ConfiguredJob> configuredJobs) {
    java.util.List<java.lang.String> result = new java.util.ArrayList<>();
    for (org.synyx.sybil.jenkins.domain.ConfiguredJob configuredJob : configuredJobs) {
        if (configuredJob.getName().equals(job.getName())) {
            result.add(configuredJob.getLedstrip());
        }
    }
    return result;
}