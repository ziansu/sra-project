@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "{id}")
@javax.ws.rs.Consumes(value = "application/json")
@javax.ws.rs.Produces(value = "application/json")
public javax.ws.rs.core.Response edit(@javax.ws.rs.PathParam(value = "id")
int id, javax.json.JsonObject json) {
    javax.json.JsonObject jsonWithId = messageController.edit(id, json);
    if (jsonWithId != null) {
        return javax.ws.rs.core.Response.ok(jsonWithId).build();
    }else {
        return javax.ws.rs.core.Response.status(Response.Status.NOT_FOUND).build();
    }
}