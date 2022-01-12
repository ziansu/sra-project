private de.otto.edison.jobs.domain.JobInfo someJobInfo(final java.lang.String jobUri, final java.lang.String type) {
    return de.otto.edison.jobs.domain.JobInfo.newJobInfo(java.net.URI.create(jobUri), type, java.time.OffsetDateTime.now(), java.time.OffsetDateTime.now(), java.util.Optional.of(java.time.OffsetDateTime.now()), JobStatus.OK, asList(de.otto.edison.jobs.domain.JobMessage.jobMessage(Level.INFO, "foo"), de.otto.edison.jobs.domain.JobMessage.jobMessage(Level.WARNING, "bar")), monitor, java.time.Clock.systemDefaultZone());
}