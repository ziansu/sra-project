@org.springframework.context.annotation.Bean
public com.netflix.genie.core.services.JobCoordinatorService jobCoordinatorService(final com.netflix.genie.core.services.JobPersistenceService jobPersistenceService, final com.netflix.genie.core.services.JobSearchService jobSearchService, final com.netflix.genie.core.services.JobSubmitterService jobSubmitterService, final com.netflix.genie.core.services.JobKillService jobKillService, @org.springframework.beans.factory.annotation.Value(value = "${genie.jobs.archive.location}")
final java.lang.String baseArchiveLocation) {
    return new com.netflix.genie.core.services.JobCoordinatorService(jobPersistenceService, jobSubmitterService, jobKillService, baseArchiveLocation);
}