private boolean isTaskRequired(com.emc.storageos.db.client.model.Volume rpVolume, com.emc.storageos.volumecontroller.impl.utils.VirtualPoolCapabilityValuesWrapper capabilities, boolean vplex, com.emc.storageos.model.TaskList taskList) {
    boolean rpNonVplexSourceVolume = (Volume.PersonalityTypes.SOURCE.name().equals(rpVolume.getPersonality())) && (!vplex);
    boolean addJournalVolume = capabilities.getAddJournalCapacity();
    boolean notAlreadyInTaskList = (com.emc.storageos.api.service.impl.placement.StorageScheduler.getPrecreatedVolume(_dbClient, taskList, rpVolume.getLabel())) == null;
    boolean createTask = (rpNonVplexSourceVolume || addJournalVolume) || notAlreadyInTaskList;
    return createTask;
}