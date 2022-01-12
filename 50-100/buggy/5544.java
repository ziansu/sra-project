public void doPost(javax.servlet.http.HttpServletRequest postRequest, javax.servlet.http.HttpServletResponse postResponse, java.util.List<java.io.Serializable> messages, org.atmosphere.gwt.server.GwtAtmosphereResource cometResource) {
    if ((cometResource != null) && (cometResource.isAlive())) {
        if ((messages.size()) == 1) {
            cometResource.post(messages.get(0));
        }else {
            cometResource.post(messages);
        }
    }
}