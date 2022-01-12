public static byte[] getJpgImageFromRemoteUrl(java.lang.String url, int maxWidth, int maxHeight) throws java.lang.Exception {
    byte[] result = null;
    java.io.InputStream inputStream = null;
    try {
        com.mantacode.reactnativeparseimageupload.URL fileUrl = new com.mantacode.reactnativeparseimageupload.URL(url);
        inputStream = fileUrl.openStream();
        result = com.mantacode.reactnativeparseimageupload.FileHelpers.getResizedImageFromStream(inputStream, maxWidth, maxHeight);
    } finally {
        if (inputStream != null) {
            inputStream.close();
        }
    }
    return result;
}