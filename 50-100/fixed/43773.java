public static boolean isAjaxRequest(javax.servlet.http.HttpServletRequest request) {
    java.lang.String extension = org.onetwo.common.web.utils.RequestUtils.getRequestExtension(request);
    java.lang.String reqeustKey = request.getHeader(RequestTypeUtils.HEADER_KEY);
    org.onetwo.common.web.utils.RequestTypeUtils.RequestType requestType = org.onetwo.common.web.utils.RequestTypeUtils.getRequestType(reqeustKey);
    return ((("json".equalsIgnoreCase(extension)) || (RequestType.Ajax.equals(requestType))) || (RequestType.Flash.equals(requestType))) || ("true".equalsIgnoreCase(request.getParameter("ajaxRequest")));
}