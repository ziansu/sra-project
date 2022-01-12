private java.lang.String addStepToRenameVolume(com.emc.storageos.workflow.Workflow workflow, com.emc.storageos.db.client.model.StorageSystem vplexSystem, java.net.URI vplexVolumeURI, java.lang.String newVolumeName, java.lang.String waitFor) {
    java.net.URI vplexURI = vplexSystem.getId();
    com.emc.storageos.workflow.Workflow.Method executeMethod = renameVolumeMethod(vplexURI, vplexVolumeURI, newVolumeName);
    workflow.createStep(com.emc.storageos.vplexcontroller.VPlexDeviceController.RENAME_VIRTUAL_VOLUME_STEP, java.lang.String.format("Rename VPLEX virtual volume: %s to %s", vplexVolumeURI, newVolumeName), waitFor, vplexURI, vplexSystem.getSystemType(), this.getClass(), executeMethod, rollbackMethodNullMethod(), waitFor);
    return com.emc.storageos.vplexcontroller.VPlexDeviceController.RENAME_VIRTUAL_VOLUME_STEP;
}