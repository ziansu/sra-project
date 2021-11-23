private java.lang.String makeS3Key(java.lang.String contentUrl) {
    org.alfresco.util.Pair<java.lang.String, java.lang.String> urlParts = super.getContentUrlParts(contentUrl);
    java.lang.String protocol = urlParts.getFirst();
    java.lang.String relativePath = urlParts.getSecond();
    if (!(protocol.equals(FileContentStore.STORE_PROTOCOL))) {
        throw new org.alfresco.repo.content.UnsupportedContentUrlException(this, ((protocol + (PROTOCOL_DELIMITER)) + relativePath));
    }
    return ((rootDirectory) + "/") + relativePath;
}