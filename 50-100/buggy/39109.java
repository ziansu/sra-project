@javax.ws.rs.GET
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Path(value = "id/{id}")
public javax.ws.rs.core.Response getEmployeeById(@javax.ws.rs.PathParam(value = "id")
long id) {
    nl.pinkroccade.faerierose.exercise.domain.Employee result = this.employeeService.findById(id);
    if (result != null) {
        javax.ws.rs.core.Response.ok(result).build();
    }
    return javax.ws.rs.core.Response.noContent().build();
}