@org.springframework.context.annotation.Bean
public org.superbiz.moviefun.blobstore.BlobStore blobStore() throws java.io.IOException {
    java.io.InputStream stream = new java.io.ByteArrayInputStream(java.lang.System.getenv("GOOGLE_CREDENTIALS").getBytes());
    com.google.cloud.storage.StorageOptions option = com.google.cloud.storage.StorageOptions.newBuilder().setCredentials(com.google.auth.oauth2.GoogleCredentials.fromStream(stream)).build();
    com.google.cloud.storage.Storage storage = option.getService();
    return new org.superbiz.moviefun.blobstore.S3Store(storage, "moviefun");
}