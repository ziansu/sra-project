private com.parse.ParseFile downloadImageFromUrl(java.lang.String str, int i) {
    try {
        java.net.URL url = new java.net.URL(str);
        java.io.File facebookImage = UrlToFile(url);
        return changeBitmapToByteAndSaveInParseFIle(i, facebookImage.getPath());
    } catch (java.net.MalformedURLException e) {
        e.printStackTrace();
    }
    return null;
}