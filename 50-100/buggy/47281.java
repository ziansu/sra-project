private boolean isTaskRequired(com.emc.storageos.db.client.model.Volume rpVolume, com.emc.storageos.volumecontroller.impl.utils.VirtualPoolCapabilityValuesWrapper capabilities, boolean vplex, boolean isChangeVpool) {
    boolean rpNonVplexSourceVolume = (Volume.PersonalityTypes.SOURCE.name().equals(rpVolume.getPersonality())) && (!vplex);
    boolean rpVplexSourceVolumeAndChangeVpool = ((Volume.PersonalityTypes.SOURCE.name().equals(rpVolume.getPersonality())) && vplex) && isChangeVpool;
    boolean addJournalVolume = capabilities.getAddJournalCapacity();
    boolean createTask = (rpNonVplexSourceVolume || rpVplexSourceVolumeAndChangeVpool) || addJournalVolume;
    return createTask;
}