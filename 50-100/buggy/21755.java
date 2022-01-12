@java.lang.Override
public java.util.List<com.microsoft.azure.management.storage.StorageAccountKey> regenerateKey(java.lang.String keyName) throws com.microsoft.azure.CloudException, java.io.IOException {
    com.microsoft.rest.ServiceResponse<com.microsoft.azure.management.storage.implementation.StorageAccountListKeysResultInner> response = this.client.regenerateKey(this.resourceGroupName(), this.key, keyName);
    com.microsoft.azure.management.storage.implementation.StorageAccountListKeysResultInner resultInner = response.getBody();
    cachedAccountKeys = resultInner.keys();
    return cachedAccountKeys;
}