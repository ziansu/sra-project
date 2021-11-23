protected void _getContent(java.io.InputStream response) throws java.io.IOException {
    java.io.BufferedReader mRd = new java.io.BufferedReader(new java.io.InputStreamReader(response));
    java.lang.String sBody = "";
    java.lang.String sContent = "";
    while ((sBody = mRd.readLine()) != null) {
        sContent += sBody + "\n";
    } 
    _sResponse = sContent;
}