private java.lang.String processJson(java.lang.String json) {
    java.lang.String client = "";
    if ((client = retrieveClientId(json)) != null) {
        clientId = client;
        activate();
    }
    if ((retrieveConnAndLikes(json)) != null) {
        status = ServerConstants.STATUS_ONLINE;
        return ServerConstants.SUCCESS_MSG;
    }else
        return retrieveEvent(json);
    
}