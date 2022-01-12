protected long _getContent(java.io.InputStream response) {
    java.io.BufferedReader mRd = new java.io.BufferedReader(new java.io.InputStreamReader(response));
    java.lang.String sBody = "";
    java.lang.String sContent = "";
    try {
        while ((sBody = mRd.readLine()) != null) {
            sContent += sBody + "\n";
        } 
    } catch (java.io.IOException e) {
        return com.licryle.httpposter.HttpPoster.FAILURE_RESPONSE;
    }
    _sResponse = sContent;
    return com.licryle.httpposter.HttpPoster.SUCCESS;
}