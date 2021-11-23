private com.emc.storageos.workflow.Workflow.Method cancelMirrorLinkMethod(java.net.URI systemURI, java.net.URI sourceURI, java.net.URI targetURI, boolean consExempt) {
    return new com.emc.storageos.workflow.Workflow.Method(com.emc.storageos.filereplicationcontroller.FileReplicationDeviceController.CANCEL_FILE_MIRROR_PAIR_METH, systemURI, sourceURI, targetURI, consExempt);
}