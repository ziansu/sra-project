@org.springframework.context.annotation.Bean
public org.springframework.scheduling.quartz.SchedulerFactoryBean schedulerFactoryBean(org.quartz.spi.JobFactory jobFactory, @org.springframework.beans.factory.annotation.Qualifier(value = "sampleJobTrigger")
wang.tomo.bootquartz.demo.Trigger sampleJobTrigger, @org.springframework.beans.factory.annotation.Qualifier(value = "cronJobTrigger")
wang.tomo.bootquartz.demo.Trigger cronJobTrigger) throws java.io.IOException {
    org.springframework.scheduling.quartz.SchedulerFactoryBean factory = new org.springframework.scheduling.quartz.SchedulerFactoryBean();
    factory.setOverwriteExistingJobs(true);
    factory.setJobFactory(jobFactory);
    factory.setTriggers(sampleJobTrigger, cronJobTrigger);
    return factory;
}