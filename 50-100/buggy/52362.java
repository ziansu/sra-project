@java.lang.Override
public void downloadFile(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.String url) throws java.io.IOException {
    java.lang.String path = ((unsortedFilesUrl) + "/") + url;
    java.io.File file = new java.io.File(path);
    app.util.FileUtils.checkExists(file);
    if (file.isDirectory()) {
        app.util.HttpUtils.sendFolderAsZip(request, response, file);
    }else {
        app.util.HttpUtils.sendFile(request, response, file);
    }
}