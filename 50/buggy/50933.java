private org.jclouds.azurecompute.arm.features.VirtualMachineScaleSetApi api() {
    com.sun.media.jfxmedia.logging.Logger.logMsg(com.sun.media.jfxmedia.logging.Logger.INFO, ("resourceGroupName: " + (resourceGroupName)));
    return api.getVirtualMachineScaleSetApi(resourceGroupName);
}