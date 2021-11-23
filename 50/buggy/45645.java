@org.springframework.context.annotation.Bean
public com.netflix.genie.core.services.JobKillService jobKillService(final java.lang.String hostname, final com.netflix.genie.core.services.JobSearchService jobSearchService, final org.apache.commons.exec.Executor executor) {
    return new com.netflix.genie.core.services.impl.LocalJobKillServiceImpl(hostname, jobSearchService, executor);
}