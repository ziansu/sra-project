@com.modifier.web.controller.RequestMapping(method = RequestMethod.POST)
public com.company.ModifierConfig create(@com.modifier.web.controller.RequestBody
com.company.ModifierConfig config) throws org.quartz.SchedulerException {
    if (((config.getInputFileURL()) != null) && (!(config.getInputFileURL().isEmpty())))
        tasksScheduler.schedule(new com.company.scheduler.ModifyQuartzTask(config));
    
    configRepository.create(config);
    return configRepository.get(config.getId());
}