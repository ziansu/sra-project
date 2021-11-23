public com.mediamath.terminalone.models.JsonResponse<? extends com.mediamath.terminalone.models.T1Entity> getMeta() {
    com.mediamath.terminalone.models.JsonResponse<? extends com.mediamath.terminalone.models.T1Entity> jsonResponse = null;
    java.lang.StringBuffer path = reportService.getMetaUri();
    java.lang.String finalPath = tOneService.constructReportingUrl(path);
    java.lang.String response = this.connection.get(finalPath, this.getUser());
    jsonResponse = reportService.parseMetaResponse(response);
    return jsonResponse;
}