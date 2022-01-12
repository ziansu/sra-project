@javax.ws.rs.GET
@javax.annotation.security.PermitAll
@javax.ws.rs.Path(value = "/{groupid}")
@javax.ws.rs.Produces(value = "application/json")
@org.ndexbio.rest.annotations.ApiDoc(value = "Returns a group JSON structure for the group specified by groupId. Errors if the group is not found. ")
public org.ndexbio.model.object.Group getGroup(@javax.ws.rs.PathParam(value = "groupid")
final java.lang.String groupId) throws java.sql.SQLException, org.ndexbio.model.exceptions.NdexException, org.ndexbio.model.exceptions.ObjectNotFoundException {
    try (org.ndexbio.common.models.dao.postgresql.GroupDAO dao = new org.ndexbio.common.models.dao.postgresql.GroupDAO()) {
        final org.ndexbio.model.object.Group group = dao.getGroupById(java.util.UUID.fromString(groupId));
        return group;
    } catch (java.io.IOException e) {
        throw new org.ndexbio.model.exceptions.NdexException(("Failed to get group: " + (e.getMessage())), e);
    }
}