@java.lang.Override
protected com.microsoft.azure.management.network.implementation.VirtualMachineScaleSetNetworkInterfaceImpl wrapModel(com.microsoft.azure.management.network.implementation.NetworkInterfaceInner inner) {
    return new com.microsoft.azure.management.network.implementation.VirtualMachineScaleSetNetworkInterfaceImpl(inner.name(), this.scaleSetName, this.resourceGroupName, inner, this.manager());
}