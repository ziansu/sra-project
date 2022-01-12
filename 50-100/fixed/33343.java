public void doAddDocumentSection(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, org.semanticwb.portal.api.SWBParamRequest paramRequest) throws java.io.IOException, org.semanticwb.portal.api.SWBResourceException {
    java.lang.String path = "/swbadmin/jsp/process/documentation/documentTemplateAddDocumentSection.jsp";
    javax.servlet.RequestDispatcher rd = request.getRequestDispatcher(path);
    try {
        request.setAttribute(org.semanticwb.process.documentation.resources.SWPDocumentTemplateResource.PARAM_REQUEST, paramRequest);
        rd.forward(request, response);
    } catch (javax.servlet.ServletException ex) {
        org.semanticwb.process.documentation.resources.SWPDocumentTemplateResource.log.error(((("Error on doAddTemplate, " + path) + ", ") + (ex.getMessage())));
    }
}