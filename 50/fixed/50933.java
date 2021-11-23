private org.jclouds.azurecompute.arm.features.VirtualMachineScaleSetApi api() {
    return api.getVirtualMachineScaleSetApi(resourceGroupName);
}