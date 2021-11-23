public com.clickntap.vimeo.VimeoResponse uploadVideo(java.io.File file, java.lang.String uploadLinkSecure) throws java.io.IOException {
    return apiRequest(uploadLinkSecure, HttpPut.METHOD_NAME, null, file);
}