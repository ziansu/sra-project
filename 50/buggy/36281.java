private com.taozeyu.calico.web_services.Response getErrorMessageResponse(com.taozeyu.calico.web_services.Response.IStatus state, java.lang.String errorMessage) {
    java.lang.String contentType = "text/html";
    return new com.taozeyu.calico.web_services.Response(state, contentType, errorMessage);
}