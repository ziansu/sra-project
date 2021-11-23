private org.json.JSONObject parseRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    java.lang.String putData = org.georchestra.lib.file.FileUtils.asString(request.getInputStream());
    org.json.JSONObject json;
    try {
        return new org.json.JSONObject(putData);
    } catch (org.json.JSONException e) {
        org.georchestra.ldapadmin.ws.backoffice.orgs.OrgsController.LOG.error(e.getMessage());
        org.georchestra.ldapadmin.ws.backoffice.utils.ResponseUtil.buildResponse(response, org.georchestra.ldapadmin.ws.backoffice.utils.ResponseUtil.buildResponseMessage(false, e.getMessage()), HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        throw new java.io.IOException(e);
    }
}