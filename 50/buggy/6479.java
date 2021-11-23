@javax.ws.rs.GET
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Path(value = "complete/{id}")
public java.lang.String getPerson(@javax.ws.rs.PathParam(value = "id")
int id) {
    entity.Person p = pf.getPerson(id);
    java.lang.String jsonStr = new com.google.gson.Gson().toJson(p);
    return jsonStr;
}