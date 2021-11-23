private java.lang.String getLedStripFromConfiguredJob(org.synyx.sybil.jenkins.domain.JenkinsJob job, java.util.List<org.synyx.sybil.jenkins.domain.ConfiguredJob> configuredJobs) {
    for (org.synyx.sybil.jenkins.domain.ConfiguredJob configuredJob : configuredJobs) {
        if (configuredJob.getName().equals(job.getName())) {
            return configuredJob.getLedstrip();
        }
    }
    return "";
}