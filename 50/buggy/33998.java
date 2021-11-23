public com.clickntap.vimeo.VimeoResponse uploadVideo(java.lang.Object input, java.lang.String uploadLinkSecure) throws java.io.IOException {
    return apiRequest(uploadLinkSecure, HttpPut.METHOD_NAME, null, input);
}