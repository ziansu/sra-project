@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "{projectId}")
public javax.ws.rs.core.Response updateProject(@javax.ws.rs.core.Context
javax.ws.rs.core.UriInfo uriInfo, @javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest request, @javax.ws.rs.PathParam(value = "projectId")
java.util.UUID projectId, de.btu.openinfra.backend.db.pojos.ProjectPojo project) {
    java.util.UUID uuid = new de.btu.openinfra.backend.db.rbac.ProjectRbac(projectId, de.btu.openinfra.backend.db.OpenInfraSchemas.PROJECTS).createOrUpdate(de.btu.openinfra.backend.db.rbac.OpenInfraHttpMethod.valueOf(request.getMethod()), uriInfo, projectId, project);
    return de.btu.openinfra.backend.rest.OpenInfraResponseBuilder.putResponse(uuid);
}