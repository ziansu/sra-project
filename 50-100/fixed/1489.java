public void doViewDocumentation(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, org.semanticwb.portal.api.SWBParamRequest paramRequest) throws java.io.IOException, org.semanticwb.portal.api.SWBResourceException {
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");
    java.lang.String path = "/swbadmin/jsp/process/documentation/userDocumentationView.jsp";
    javax.servlet.RequestDispatcher rd = request.getRequestDispatcher(path);
    try {
        request.setAttribute(org.semanticwb.process.documentation.resources.SWPUserDocumentationResource.PARAM_REQUEST, paramRequest);
        rd.forward(request, response);
    } catch (javax.servlet.ServletException ex) {
        log.error("Error on doViewDocumentation", ex);
    }
}