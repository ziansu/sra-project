@java.lang.Override
public com.claymus.data.transfer.BlobEntry newBlob(java.lang.String fileName, byte[] data, java.lang.String mimeType) {
    return blobAccessor.newBlob(fileName, data, mimeType);
}