public void sendAcpAction(int acpId, int port, server.domain.MODE mode) throws java.lang.Exception {
    if ((this.getCurrentAcp().getPorts()[(port - 1)]) != mode) {
        server.spec.CurrentAcpControlSpec currentAcpControlSpec = ((server.spec.CurrentAcpControlSpec) (server.utils.MessageFactory.createEmptyMessage("server.spec.CurrentAcpControlSpec")));
        currentAcpControlSpec.setControlNumber(port);
        currentAcpControlSpec.setNewMode(mode);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        this.sendMessage(gson.toJson(currentAcpControlSpec).toString());
    }
}