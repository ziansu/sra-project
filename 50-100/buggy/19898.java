public void writeJson(org.springframework.extensions.webscripts.WebScriptResponse response) throws java.io.IOException {
    response.setContentEncoding("UTF-8");
    response.setContentType(MimetypeMap.MIMETYPE_JSON);
    try {
        org.json.JSONObject jsonOutput = generateJsonOutput();
        response.getWriter().write(jsonOutput.toString());
    } catch (org.json.JSONException e) {
        throw new org.springframework.extensions.webscripts.WebScriptException(org.springframework.extensions.webscripts.Status.STATUS_INTERNAL_SERVER_ERROR, "Error writing json response.", e);
    }
    this.writeJson(response, getPrintOutput());
}