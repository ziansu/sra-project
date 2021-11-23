@java.lang.Override
public void renameObject(@javax.annotation.Nullable
java.lang.String bucket, @javax.annotation.Nonnull
java.lang.String object, @javax.annotation.Nonnull
java.lang.String newName) throws org.dasein.cloud.azure.storage.CloudException, org.dasein.cloud.azure.storage.InternalException {
    if (bucket == null) {
        throw new org.dasein.cloud.azure.storage.CloudException("No bucket was specified");
    }
    copy(bucket, object, bucket, newName);
    removeObject(bucket, object);
}