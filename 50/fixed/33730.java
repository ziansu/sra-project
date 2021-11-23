@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/{id: [0-9]+}")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public com.excilys.computerdatabase.core.model.Company get(@javax.ws.rs.PathParam(value = "id")
long id) {
    if (companyDBService.exists(id)) {
        return companyDBService.findOne(id);
    }
    return null;
}