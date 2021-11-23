@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.lang.String insertPerson(java.lang.String personAsJson) {
    facade.InfoEntityFacade ief = new facade.InfoEntityFacade();
    entity.InfoEntity q = rest.PersonResource.gson.fromJson(personAsJson, entity.Person.class);
    ief.addPerson(q);
    return rest.PersonResource.gson.toJson(q);
}