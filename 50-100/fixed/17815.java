private void buildRequest() throws java.io.IOException {
    if (org.apache.commons.lang3.StringUtils.isEmpty(mServerUrl)) {
        return ;
    }
    if ((mMethod) == (com.coderyuan.yyframework.http.HttpUtil.Method.GET)) {
        buildGetRequest();
    }else {
        mUrl = new java.net.URL(mServerUrl);
    }
    if ((mUrl) == null) {
        return ;
    }
    setHeaders();
    if ((mConnection) == null) {
        return ;
    }
    if ((mMethod) != (com.coderyuan.yyframework.http.HttpUtil.Method.GET)) {
        buildPostRequest();
    }
}