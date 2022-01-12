@javax.annotation.PostConstruct
@org.motechproject.event.listener.annotations.MotechListener(subjects = org.motechproject.openmrs19.tasks.constants.EventSubjects.UPDATE_TASKS_CHANNEL)
public void updateTasksChannel() {
    try {
        org.motechproject.openmrs19.tasks.OpenMRSTasksNotifier.LOGGER.info("Updating tasks integration");
        java.lang.Object service = getChannelService();
        if (service != null) {
            org.motechproject.openmrs19.tasks.OpenMRSTasksNotifier.LOGGER.info("Registering OpenMRS tasks channel through the channel service");
            getTasksChannelServiceInstance(service).updateTaskChannel();
        }else {
            org.motechproject.openmrs19.tasks.OpenMRSTasksNotifier.LOGGER.warn("No channel service present, channel not registered");
        }
    } catch (org.motechproject.tasks.exception.ValidationException e) {
        org.motechproject.openmrs19.tasks.OpenMRSTasksNotifier.LOGGER.error("Channel generated was not accepted by tasks due to validation errors", e);
    }
}