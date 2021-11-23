public java.io.File resolve(java.lang.String location) {
    try {
        java.net.URL url = new java.net.URL(location);
        java.io.File download = download(url);
        return extractArchive(download);
    } catch (java.net.MalformedURLException e) {
        java.io.File file = new java.io.File(location);
        if (file.exists()) {
            return file;
        }
    }
    return null;
}