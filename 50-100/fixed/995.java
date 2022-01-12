protected javax.servlet.http.HttpServletRequest extractHttpServletRequest(java.lang.Object object) {
    if (object instanceof org.springframework.extensions.webscripts.servlet.WebScriptServletRequest) {
        org.springframework.extensions.webscripts.servlet.WebScriptServletRequest request = ((org.springframework.extensions.webscripts.servlet.WebScriptServletRequest) (object));
        return request.getHttpServletRequest();
    }else
        if (object instanceof org.springframework.extensions.webscripts.WrappingWebScriptRequest) {
            org.springframework.extensions.webscripts.WrappingWebScriptRequest wrappingWebScriptRequest = ((org.springframework.extensions.webscripts.WrappingWebScriptRequest) (object));
            org.springframework.extensions.webscripts.servlet.WebScriptServletRequest request = ((org.springframework.extensions.webscripts.servlet.WebScriptServletRequest) (wrappingWebScriptRequest.getNext()));
            return request.getHttpServletRequest();
        }
    
    return null;
}