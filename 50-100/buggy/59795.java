public com.microsoft.azure.management.Azure getAzureClient(java.lang.String sid) throws java.io.IOException {
    if ((azureManager) == null) {
        throw new java.io.IOException(com.microsoft.azuretools.authmanage.AuthMethodManager.CANNOT_GET_AZURE_MANAGER);
    }
    com.microsoft.azure.management.Azure azure = azureManager.getAzure(sid);
    if (azure == null) {
        throw new java.io.IOException(com.microsoft.azuretools.authmanage.AuthMethodManager.CANNOT_GET_AZURE_BY_SID);
    }
    return azure;
}