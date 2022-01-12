@com.pratilipi.api.annotation.Get
public com.pratilipi.api.shared.GenericResponse get(com.pratilipi.api.impl.test.TestApi.GetRequest request) throws com.pratilipi.common.exception.InsufficientAccessException {
    try {
        com.pratilipi.data.type.BlobEntry blobEntry = com.pratilipi.common.util.HttpUtil.doGet(request.url);
        new com.pratilipi.api.shared.GenericFileDownloadResponse(blobEntry.getData(), blobEntry.getMimeType(), blobEntry.getETag());
    } catch (com.pratilipi.common.exception.UnexpectedServerException e) {
        e.printStackTrace();
    }
    return new com.pratilipi.api.shared.GenericResponse();
}