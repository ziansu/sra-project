@java.lang.Override
public void move(@javax.annotation.Nullable
java.lang.String sourceBucket, @javax.annotation.Nullable
java.lang.String object, @javax.annotation.Nullable
java.lang.String targetBucket) throws org.dasein.cloud.azure.storage.CloudException, org.dasein.cloud.azure.storage.InternalException {
    if (sourceBucket == null) {
        throw new org.dasein.cloud.azure.storage.CloudException("No source bucket was specified");
    }
    if (targetBucket == null) {
        throw new org.dasein.cloud.azure.storage.CloudException("No target bucket was specified");
    }
    if (object == null) {
        throw new org.dasein.cloud.azure.storage.CloudException("No source object was specified");
    }
    copy(sourceBucket, object, targetBucket, object);
    removeObject(sourceBucket, object);
}