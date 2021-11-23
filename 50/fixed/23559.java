@md.utm.fi.datawarehause.DELETE
@md.utm.fi.datawarehause.Path(value = "/{id}")
@md.utm.fi.datawarehause.Consumes(value = "application/json")
@md.utm.fi.datawarehause.Produces(value = "application/json")
public javax.ws.rs.core.Response deleteEmployee(@md.utm.fi.datawarehause.PathParam(value = "id")
java.lang.Integer id) {
    userDAO.deleteEmploye(id);
    return javax.ws.rs.core.Response.status(201).build();
}