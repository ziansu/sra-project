public static final boolean isFormEncodedRequest(final javax.servlet.http.HttpServletRequest request) {
    java.lang.String contentType = request.getContentType();
    if (contentType == null)
        return false;
    else
        if (contentType.toLowerCase().startsWith(uws.service.request.FormEncodedParser.EXPECTED_CONTENT_TYPE))
            return true;
        else
            return false;
        
    
}