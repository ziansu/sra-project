@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "/{orgName}")
public javax.ws.rs.core.Response removeOrganization(@javax.ws.rs.PathParam(value = "orgName")
java.lang.String orgName) {
    getRepository().removeOrganization(orgName);
    return success();
}