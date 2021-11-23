@javax.ws.rs.Path(value = "/")
@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response create(@javax.validation.constraints.NotNull
@javax.validation.Valid
com.lftechnology.vyaguta.resource.entity.ProjectRole projectRole) {
    projectRole = projectRoleService.save(projectRole);
    return javax.ws.rs.core.Response.status(Response.Status.OK).entity(projectRole).build();
}