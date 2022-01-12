@com.pratilipi.api.annotation.Get
public com.pratilipi.api.shared.GenericResponse get(com.pratilipi.api.impl.init.InitBannerApi.GetRequest request) throws com.pratilipi.common.exception.InvalidArgumentException, com.pratilipi.common.exception.UnexpectedServerException {
    com.pratilipi.data.type.BlobEntry blobEntry = com.pratilipi.data.util.InitDataUtil.getInitBanner(request.language, request.name, request.width);
    return new com.pratilipi.api.shared.GenericFileDownloadResponse(blobEntry.getData(), blobEntry.getMimeType(), blobEntry.getETag());
}