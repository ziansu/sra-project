public void moveBlob(java.lang.String container, java.lang.String sourceBlob, java.lang.String targetBlob) throws com.microsoft.azure.storage.StorageException, java.net.URISyntaxException {
    java.lang.String sourceAccount = this.getAccount(sourceBlob);
    java.lang.String targetAccount = this.getAccount(targetBlob);
    this.client.moveBlob(sourceAccount, targetAccount, this.locMode, container, sourceBlob, targetBlob);
}