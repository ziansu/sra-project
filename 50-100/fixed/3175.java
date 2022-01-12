public client.model.ClientModel getClientModel(int version) {
    client.model.ClientModel newclient = null;
    java.lang.String JsonClient = clientComm.send(("game/model?version=" + version), "");
    if (!(JsonClient.equals("\"true\"\r"))) {
        java.lang.System.out.println(JsonClient);
        newclient = g.fromJson(JsonClient, client.model.ClientModel.class);
    }
    return newclient;
}