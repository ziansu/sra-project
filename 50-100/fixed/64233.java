@java.lang.Override
public void rename(java.lang.String pathFrom, java.lang.String pathTo) throws java.io.IOException {
    java.lang.String[] bucketKeyFrom = splitPathToBucketAndKey(pathFrom, true);
    java.lang.String[] bucketKeyTo = splitPathToBucketAndKey(pathTo, true);
    com.amazonaws.services.s3.model.CopyObjectRequest copyRequest = new com.amazonaws.services.s3.model.CopyObjectRequest(bucketKeyFrom[0], bucketKeyFrom[1], bucketKeyTo[0], bucketKeyTo[1]);
    this.amazonS3.copyObject(copyRequest);
    this.amazonS3.deleteObject(bucketKeyFrom[0], bucketKeyFrom[1]);
}