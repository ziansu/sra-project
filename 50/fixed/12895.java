@java.lang.Override
public void updateLastRun(java.lang.Long configId, org.joda.time.DateTime lastRun) {
    io.linuxserver.davos.persistence.model.ScheduleConfigurationModel model = getConfig(configId);
    model.lastRun = lastRun.toDate();
    configRepository.save(model);
}