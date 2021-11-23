@java.lang.Override
protected void cleanUpResources() {
    resourceManager.resourceGroups().deleteByName(com.microsoft.azure.management.compute.VirtualMachineScaleSetOperationsTests.RG_NAME);
}