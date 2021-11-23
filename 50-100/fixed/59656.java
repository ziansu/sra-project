public com.podio.sdk.Request<com.podio.sdk.domain.File.Attach> attachFile(long fileId, java.lang.String refType, int refId) {
    com.podio.sdk.provider.FileProvider.FileFilter filter = new com.podio.sdk.provider.FileProvider.FileFilter();
    filter.withFileId(fileId);
    com.podio.sdk.domain.File.Attach attach = new com.podio.sdk.domain.File.Attach(refType, refId);
    return post(filter, attach, File.Attach.class);
}