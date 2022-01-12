@java.lang.Override
public void execute() throws java.lang.Exception {
    try {
        com.emc.sa.machinetags.MachineTagUtils.setBlockVolumeTag(getClient(), volumeId, tagName, tagValue);
    } catch (java.lang.Exception ex) {
        java.lang.String command = com.emc.sa.service.vipr.block.BlockStorageUtils.getVolumeTagCommand(volumeId, tagName, tagValue);
        com.emc.sa.engine.ExecutionUtils.fail("failTask.SetBlockVolumeMachineTag", new java.lang.Object[]{ command });
    }
}