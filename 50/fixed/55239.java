@java.lang.Override
public java.lang.String networkId() {
    com.microsoft.azure.SubResource subnetRef = this.inner().subnet();
    return subnetRef != null ? com.microsoft.azure.management.resources.fluentcore.arm.ResourceUtils.parentResourcePathFromResourceId(subnetRef.id()) : null;
}