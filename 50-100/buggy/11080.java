@org.springframework.context.annotation.Bean
public org.springframework.scheduling.quartz.SchedulerFactoryBean schedulerFactoryBean(javax.sql.DataSource dataSource, org.quartz.spi.JobFactory jobFactory, @org.springframework.beans.factory.annotation.Qualifier(value = "sampleJobTrigger")
org.quartz.Trigger sampleJobTrigger) throws java.io.IOException {
    org.springframework.scheduling.quartz.SchedulerFactoryBean factory = new org.springframework.scheduling.quartz.SchedulerFactoryBean();
    factory.setOverwriteExistingJobs(true);
    factory.setDataSource(dataSource);
    factory.setJobFactory(jobFactory);
    factory.setQuartzProperties(quartzProperties());
    factory.setTriggers(sampleJobTrigger);
    return factory;
}