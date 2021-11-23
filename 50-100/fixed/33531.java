@java.lang.Override
protected ge.edu.freeuni.sdp.iot.switches.sprinkler.model.SwitchStatus sendSwitchCommand(ge.edu.freeuni.sdp.iot.switches.sprinkler.model.HouseData houseData, ge.edu.freeuni.sdp.iot.switches.sprinkler.model.SwitchCommand switchCommand) {
    java.lang.String url = getUrl(houseData);
    javax.ws.rs.core.Response response = client.target(url).request(MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.json(switchCommand.toString()));
    if ((response.getStatus()) != (Response.Status.OK.getStatusCode()))
        return null;
    
    return response.readEntity(ge.edu.freeuni.sdp.iot.switches.sprinkler.model.SwitchStatus.class);
}