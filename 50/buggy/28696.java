@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = "application/json")
@javax.ws.rs.Produces(value = "application/json")
public javax.ws.rs.core.Response add(javax.json.JsonObject json) {
    return javax.ws.rs.core.Response.ok(messageController.addJson(json)).build();
}