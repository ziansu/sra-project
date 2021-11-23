@javax.ws.rs.GET
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON })
@javax.ws.rs.Path(value = "/getPastNextScheduleList")
public javax.ws.rs.core.Response getPastNextScheduleNextList(@javax.ws.rs.QueryParam(value = "user")
java.lang.String userId, @javax.ws.rs.QueryParam(value = "date")
long date) {
    java.util.List<jp.cloudgarden.sever.model.Schedule> past = controller.getPastNextScheduleList(userId, date);
    if (past == null) {
        return javax.ws.rs.core.Response.status(403).entity(jp.cloudgarden.sever.jax.JaxAdapter.ERR_STATUS).build();
    }
    java.lang.String ret = ("{\"schedule\":[" + (past.get(0).getJsonString())) + "]}";
    return javax.ws.rs.core.Response.status(200).entity(ret).build();
}