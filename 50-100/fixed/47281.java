private boolean isTaskRequired(com.emc.storageos.db.client.model.Volume rpVolume, com.emc.storageos.volumecontroller.impl.utils.VirtualPoolCapabilityValuesWrapper capabilities, boolean vplex) {
    boolean rpNonVplexSourceVolume = (Volume.PersonalityTypes.SOURCE.name().equals(rpVolume.getPersonality())) && (!vplex);
    boolean addJournalVolume = capabilities.getAddJournalCapacity();
    boolean createTask = rpNonVplexSourceVolume || addJournalVolume;
    return createTask;
}