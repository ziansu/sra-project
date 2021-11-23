@com.microsoft.azure.storage.DoesServiceRequest
public com.microsoft.azure.storage.blob.BlobOutputStream openWriteExisting(com.microsoft.azure.storage.AccessCondition accessCondition, com.microsoft.azure.storage.blob.BlobRequestOptions options, com.microsoft.azure.storage.OperationContext opContext) throws com.microsoft.azure.storage.StorageException {
    return this.openOutputStreamInternal(null, accessCondition, options, opContext);
}