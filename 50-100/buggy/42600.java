@io.craigmiller160.orgbuilder.server.rest.resource.GET
@javax.annotation.security.RolesAllowed(value = { io.craigmiller160.orgbuilder.server.rest.Role.MASTER , io.craigmiller160.orgbuilder.server.rest.Role.ADMIN })
public javax.ws.rs.core.Response getAllUsers(@io.craigmiller160.orgbuilder.server.rest.resource.BeanParam
io.craigmiller160.orgbuilder.server.rest.UserFilterBean userFilterBean) throws io.craigmiller160.orgbuilder.server.OrgApiException {
    userFilterBean.validateFilterParams();
    io.craigmiller160.orgbuilder.server.service.UserService service = factory.newUserService(securityContext);
    io.craigmiller160.orgbuilder.server.dto.UserListDTO results = service.getAllUsers(resourceFilterBean.getOffset(), resourceFilterBean.getSize());
    if (results != null) {
        return javax.ws.rs.core.Response.ok(results).build();
    }
    return javax.ws.rs.core.Response.noContent().build();
}