public void downloadPoster(java.io.File posterFile, boolean bigVersion) {
    if (!(this.poster.isEmpty())) {
        java.lang.String url = this.poster;
        if (bigVersion == true) {
            url = url.replaceAll("\\._V1_(.*?)\\.jpg", "._V1_.jpg");
        }
        downloadFile(posterFile, url);
    }
}