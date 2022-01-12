@md.utm.fi.datawarehause.GET
@md.utm.fi.datawarehause.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response convertFtoC() {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    try {
        java.lang.String result = mapper.writeValueAsString(serializeObjects(userDAO.getFromDB("users")));
        return javax.ws.rs.core.Response.status(200).entity(result).build();
    } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
        e.printStackTrace();
    }
    return javax.ws.rs.core.Response.status(404).build();
}