protected java.lang.String getIdFromToken(java.lang.String token) {
    if (token == null)
        return null;
    
    javax.ws.rs.client.Client client = javax.ws.rs.client.ClientBuilder.newClient(new org.glassfish.jersey.client.ClientConfig());
    org.glassfish.jersey.client.ClientResponse response = client.target(((ge.edu.freeuni.sdp.xo.rooms.service.RoomsService.LOGIN_SERVICE) + token)).request(MediaType.APPLICATION_JSON_TYPE).get(org.glassfish.jersey.client.ClientResponse.class);
    if ((response.getStatus()) != (Status.OK.getStatusCode()))
        return null;
    
    ge.edu.freeuni.sdp.xo.rooms.service.UserName username = response.readEntity(ge.edu.freeuni.sdp.xo.rooms.service.UserName.class);
    return username.username;
}