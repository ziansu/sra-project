public org.apache.tika.mime.MediaType detect(java.io.InputStream inputStream, org.apache.tika.metadata.Metadata metadata) throws java.io.IOException {
    java.lang.String ct = metadata.get(org.apache.tika.metadata.HttpHeaders.CONTENT_TYPE);
    if (ct != null) {
        return org.apache.tika.mime.MediaType.parse(ct);
    }else {
        return detector.detect(inputStream, metadata);
    }
}