@java.lang.Override
public com.microsoft.azure.management.network.implementation.PublicIpAddressImpl create() throws java.lang.Exception {
    super.create();
    com.microsoft.rest.ServiceResponse<com.microsoft.azure.management.network.implementation.api.PublicIPAddressInner> response = this.client.createOrUpdate(this.resourceGroupName(), this.key(), this.inner());
    this.setInner(response.getBody());
    clearWrapperProperties();
    return this;
}