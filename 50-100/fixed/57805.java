private com.taozeyu.calico.web_services.Response generateResourceResponse(java.lang.String path) throws java.io.FileNotFoundException {
    java.io.File resourceFile = router.getFile(path);
    if (!(isFile(resourceFile))) {
        return getErrorMessageResponse(com.taozeyu.calico.web_services.NOT_FOUND, ("404 Resource Not Found:" + path));
    }
    java.lang.String contentType = getContentTypeByExtensionName(com.taozeyu.calico.util.PathUtil.getExtensionName(path));
    java.io.InputStream is = new java.io.BufferedInputStream(new java.io.FileInputStream(resourceFile), 1024);
    return new com.taozeyu.calico.web_services.Response(OK, contentType, is);
}