private javax.servlet.http.HttpServletResponse extractHttpServletResponse(java.lang.Object object) {
    if (object instanceof org.springframework.extensions.webscripts.servlet.WebScriptServletResponse) {
        org.springframework.extensions.webscripts.servlet.WebScriptServletResponse response = ((org.springframework.extensions.webscripts.servlet.WebScriptServletResponse) (object));
        return response.getHttpServletResponse();
    }else
        if (object instanceof org.springframework.extensions.webscripts.WrappingWebScriptResponse) {
            org.springframework.extensions.webscripts.WrappingWebScriptResponse wrappingWebScriptResponse = ((org.springframework.extensions.webscripts.WrappingWebScriptResponse) (object));
            org.springframework.extensions.webscripts.servlet.WebScriptServletResponse response = ((org.springframework.extensions.webscripts.servlet.WebScriptServletResponse) (wrappingWebScriptResponse.getNext()));
            return response.getHttpServletResponse();
        }
    
    return null;
}