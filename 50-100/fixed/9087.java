@java.lang.Override
public com.microsoft.azure.management.storage.implementation.StorageAccountImpl refresh() throws java.lang.Exception {
    com.microsoft.rest.ServiceResponse<com.microsoft.azure.management.storage.implementation.StorageAccountInner> response = this.client.getProperties(this.resourceGroupName(), this.name());
    com.microsoft.azure.management.storage.implementation.StorageAccountInner storageAccountInner = response.getBody();
    this.setInner(storageAccountInner);
    clearWrapperProperties();
    return this;
}