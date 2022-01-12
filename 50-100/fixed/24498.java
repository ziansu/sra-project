@java.lang.Override
public java.util.List<com.microsoft.azure.management.storage.StorageAccountKey> refreshKeys() throws com.microsoft.azure.CloudException, java.io.IOException {
    com.microsoft.rest.ServiceResponse<com.microsoft.azure.management.storage.implementation.StorageAccountListKeysResultInner> response = this.client.listKeys(this.resourceGroupName(), this.name());
    com.microsoft.azure.management.storage.implementation.StorageAccountListKeysResultInner resultInner = response.getBody();
    cachedAccountKeys = resultInner.keys();
    return cachedAccountKeys;
}