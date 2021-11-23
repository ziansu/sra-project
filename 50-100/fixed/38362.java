public java.lang.String getPath(java.lang.String url) {
    java.lang.String result = "fail";
    try {
        java.net.URI path = new java.net.URI(url.replace(" ", "%20"));
        result = path.toString();
    } catch (java.net.URISyntaxException ex) {
        java.util.logging.Logger.getLogger(domein.DownloadThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    if ((result.charAt(0)) == '/') {
        result = result.substring(1);
    }
    return result;
}