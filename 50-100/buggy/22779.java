public void serveResource(javax.portlet.ResourceRequest request, javax.portlet.ResourceResponse response) throws java.io.IOException, javax.portlet.PortletException {
    org.gfbio.submissions.Submissions._log.info("a");
    response.setContentType("text/html");
    if ((request.getParameter("responseTarget")) != null) {
        org.gfbio.submissions.Submissions._log.info("b");
        if ("getresearchobjectinformation".toString().equals(request.getParameter("responseTarget").toString())) {
            org.gfbio.submissions.Submissions._log.info("c");
            getResearchObjectInformation(request, response);
        }
    }
}