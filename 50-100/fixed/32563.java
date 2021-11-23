public void doActualizaTab(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, org.semanticwb.portal.api.SWBParamRequest paramRequest) throws java.io.IOException, org.semanticwb.portal.api.SWBResourceException {
    response.setContentType(org.semanticwb.process.documentation.resources.SWPDocumentationResource.HTMLCONTENTTYPE);
    response.setCharacterEncoding(org.semanticwb.process.documentation.resources.SWPDocumentationResource.UTF8);
    java.lang.String path = "/swbadmin/jsp/process/documentation/actualizaTab.jsp";
    javax.servlet.RequestDispatcher rd = request.getRequestDispatcher(path);
    try {
        request.setAttribute(org.semanticwb.process.documentation.resources.SWPDocumentationResource.PARAM_REQUEST, paramRequest);
        rd.forward(request, response);
    } catch (javax.servlet.ServletException ex) {
        org.semanticwb.process.documentation.resources.SWPDocumentationResource.log.error(("Error on doActualizaTab, " + path), ex);
    }
}