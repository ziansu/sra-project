@com.modifier.web.controller.RequestMapping(method = RequestMethod.POST)
public com.company.ModifierConfig create(@com.modifier.web.controller.RequestBody
com.company.ModifierConfig config) throws org.quartz.SchedulerException {
    configRepository.create(config);
    if (((config.getInputFileURL()) != null) && (!(config.getInputFileURL().isEmpty()))) {
        tasksScheduler.schedule(new com.company.scheduler.ModifyQuartzTask(config));
    }
    return configRepository.get(config.getId());
}