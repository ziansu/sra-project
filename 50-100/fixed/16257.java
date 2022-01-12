private void readResponseBody(java.net.HttpURLConnection urlConn, it.holiday69.tinyhttp.vo.HttpResponse httpResponse) throws java.lang.Exception {
    bytesDownloadTotal.set(httpResponse.responseLength);
    switch (responseType) {
        case AUTO :
            if (isTextMimeType(httpResponse.responseType))
                readResponseAsText(urlConn);
            else
                readResponseAsFile(urlConn);
            
            break;
        case FILE :
            readResponseAsFile(urlConn);
            break;
        case TEXT :
            readResponseAsText(urlConn);
            break;
    }
}