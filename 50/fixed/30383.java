@java.lang.Override
public boolean remove(java.lang.String path) throws java.io.IOException {
    java.lang.String[] bucketKey = splitPathToBucketAndKey(path, true);
    this.amazonS3.deleteObject(bucketKey[0], bucketKey[1]);
    return true;
}