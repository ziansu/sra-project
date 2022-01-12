private void buildRequest() throws java.io.IOException {
    if (org.apache.commons.lang3.StringUtils.isEmpty(mServerUrl)) {
        return ;
    }
    buildStringParam();
    if ((mMethod) == (com.coderyuan.yyframework.http.HttpUtil.Method.GET)) {
        buildGetRequest();
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