private void updateTasksChannel() {
    org.motechproject.openmrs19.tasks.OpenMRSTasksNotifier.LOGGER.info("Updating tasks integration");
    java.lang.Object service = getChannelService();
    if (service != null) {
        org.motechproject.openmrs19.tasks.OpenMRSTasksNotifier.LOGGER.info("Registering OpenMRS tasks channel through the channel service");
        getTasksChannelServiceInstance(service).updateTaskChannel();
    }else {
        org.motechproject.openmrs19.tasks.OpenMRSTasksNotifier.LOGGER.warn("No channel service present, channel not registered");
    }
}