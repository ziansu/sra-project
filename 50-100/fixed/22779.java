public void serveResource(javax.portlet.ResourceRequest request, javax.portlet.ResourceResponse response) throws java.io.IOException, javax.portlet.PortletException {
    response.setContentType("text/html");
    if ((request.getParameter("responseTarget")) != null) {
        if ("getresearchobjectinformation".toString().equals(request.getParameter("responseTarget").toString())) {
            getResearchObjectInformation(request, response);
        }
    }
}