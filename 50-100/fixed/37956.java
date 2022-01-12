private static psi.lesotho.service.ResponseInfo getAllFU(javax.servlet.http.HttpServletRequest request, java.lang.String loginUsername) throws java.io.IOException, java.io.UnsupportedEncodingException, java.lang.Exception, javax.servlet.ServletException {
    psi.lesotho.service.ResponseInfo responseInfo = null;
    try {
        java.lang.String requestUrl = (psi.lesotho.service.EventController.URL_QUERY_FUCASE_ALL) + loginUsername;
        responseInfo = psi.lesotho.service.Util.sendRequest(Util.REQUEST_TYPE_GET, requestUrl, null, null);
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println(("Exception: " + (ex.toString())));
    }
    return responseInfo;
}