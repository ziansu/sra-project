@java.lang.Override
public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetImpl attach() {
    return this.parent().withExtension(this);
}