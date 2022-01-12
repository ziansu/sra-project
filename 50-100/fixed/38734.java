public java.lang.String addStepsForPostDeleteVolumes(com.emc.storageos.workflow.Workflow workflow, java.lang.String waitFor, java.util.List<com.emc.storageos.blockorchestrationcontroller.VolumeDescriptor> volumeDescriptors, java.lang.String taskId, com.emc.storageos.volumecontroller.impl.block.taskcompleter.VolumeWorkflowCompleter completer, com.emc.storageos.volumecontroller.impl.block.BlockDeviceController blockDeviceController) throws com.emc.storageos.svcs.errorhandling.resources.InternalException {
    java.util.List<com.emc.storageos.blockorchestrationcontroller.VolumeDescriptor> rpSourceDescriptors = com.emc.storageos.blockorchestrationcontroller.VolumeDescriptor.filterByType(volumeDescriptors, new com.emc.storageos.blockorchestrationcontroller.VolumeDescriptor.Type[]{ VolumeDescriptor.Type.RP_SOURCE , VolumeDescriptor.Type.RP_VPLEX_VIRT_SOURCE }, new com.emc.storageos.blockorchestrationcontroller.VolumeDescriptor.Type[]{  });
    if (rpSourceDescriptors.isEmpty()) {
        return waitFor;
    }
    return addRemoveProtectionOnVolumeStep(workflow, waitFor, volumeDescriptors, taskId, blockDeviceController);
}