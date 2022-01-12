public static long linkProfilePicture(java.lang.String path, java.lang.String picUrl) throws com.liferay.portal.kernel.exception.SystemException {
    try {
        java.net.URL url = new java.net.URL(picUrl);
        return org.xcolab.portlets.loginregister.ImageUploadUtils.uploadImage(url, path);
    } catch (java.net.MalformedURLException e) {
        org.xcolab.portlets.loginregister.ImageUploadUtils._log.warn(("Could not upload  image with url " + picUrl), e);
    }
    return 0L;
}