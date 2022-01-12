public void close() throws java.io.IOException {
    super.close();
    try {
        t.join();
        org.jets3t.service.model.S3Object s3Object = getS3Object(true);
        byte[] bytes = output.toByteArray();
        s3Object.setContentLength(bytes.length);
        s3Object.setDataInputStream(new java.io.ByteArrayInputStream(bytes));
        fileSystem.getS3Service().putObject(getS3Bucket(), s3Object);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}