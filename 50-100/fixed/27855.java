@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public java.util.List<org.carlspring.strongbox.cron.domain.CronTaskConfiguration> findByName(java.lang.String name) {
    try {
        return repository.findByName(name);
    } catch (java.lang.Exception e) {
        org.carlspring.strongbox.cron.services.impl.CronTaskDataServiceImpl.logger.warn(("Internal spring-data-orientdb exception: " + (e.getMessage())), e);
        return new java.util.LinkedList<>();
    }
}