@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/{orgName}/group/{groupName}/tag")
@javax.ws.rs.Consumes(value = "text/plain")
@javax.ws.rs.Produces(value = "application/json")
public javax.ws.rs.core.Response createTag(@javax.ws.rs.PathParam(value = "orgName")
java.lang.String orgName, @javax.ws.rs.PathParam(value = "groupName")
java.lang.String groupName, @javax.ws.rs.QueryParam(value = "name")
java.lang.String tagName, java.lang.String description) {
    io.scepta.model.Tag tag = getRepository().createTag(orgName, groupName, tagName, description);
    initBuild(orgName, groupName, tagName);
    return success(tag);
}