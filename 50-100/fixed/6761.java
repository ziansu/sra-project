@org.cba.rest.resources.PUT
@org.cba.rest.resources.Path(value = "edit/{id}")
@org.cba.rest.resources.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response editCompany(@org.cba.rest.resources.PathParam(value = "id")
int id, java.lang.String content) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    org.cba.entities.Company company = gson.fromJson(content, org.cba.entities.Company.class);
    if (company == null) {
        throw new org.cba.rest.resources.WebApplicationException(Response.Status.NOT_FOUND);
    }
    try {
        facade.editCompany(company);
    } catch (org.cba.exception.EntityNotFoundException e) {
        e.printStackTrace();
        javax.ws.rs.core.Response.status(Response.Status.NOT_FOUND);
    }
    return javax.ws.rs.core.Response.status(200).build();
}