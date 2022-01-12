public void upload(java.lang.String url, com.mozz.http.HttpUploadFileListener l, java.util.Map<java.lang.String, java.io.File> fileList, java.util.Map<java.lang.String, java.lang.String> postData) {
    com.mozz.http.HttpUtils.httpExecutor.execute(new com.mozz.http.HttpUtils.HttpPostFile(url, fileList, postData, l));
}