public org.apache.tika.mime.MediaType detect(java.io.InputStream inputStream, org.apache.tika.metadata.Metadata metadata) throws java.io.IOException {
    java.lang.String ct = metadata.get(org.apache.tika.metadata.HttpHeaders.CONTENT_TYPE);
    org.apache.tika.mime.MediaType type = null;
    if (ct != null) {
        type = org.apache.tika.mime.MediaType.parse(ct);
    }
    if (type != null) {
        return type;
    }else {
        return detector.detect(inputStream, metadata);
    }
}