@java.lang.Override
protected void cleanUpResources() {
    if ((com.microsoft.azure.management.compute.VirtualMachineScaleSetOperationsTests.RG_NAME) != null) {
        resourceManager.resourceGroups().deleteByName(com.microsoft.azure.management.compute.VirtualMachineScaleSetOperationsTests.RG_NAME);
    }
}