@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "/{groupId}")
@javax.ws.rs.Produces(value = "application/json")
@org.ndexbio.rest.annotations.ApiDoc(value = "Delete the group specified by groupId. " + "Errors if the group is not found or if the authenticated user does not have authorization to delete the group.")
public void deleteGroup(@javax.ws.rs.PathParam(value = "groupId")
final java.lang.String groupId) throws java.io.IOException, java.sql.SQLException, org.apache.solr.client.solrj.SolrServerException, org.ndexbio.model.exceptions.NdexException, org.ndexbio.model.exceptions.ObjectNotFoundException {
    org.ndexbio.rest.services.GroupService.logger.info("[start: Deleting group {}]", groupId);
    try (org.ndexbio.common.models.dao.postgresql.GroupDAO dao = new org.ndexbio.common.models.dao.postgresql.GroupDAO()) {
        dao.deleteGroupById(java.util.UUID.fromString(groupId), this.getLoggedInUser().getExternalId());
        org.ndexbio.common.solr.GroupIndexManager m = new org.ndexbio.common.solr.GroupIndexManager();
        m.deleteGroup(groupId);
        dao.commit();
        org.ndexbio.rest.services.GroupService.logger.info("[end: Group {} deleted]", groupId);
    }
}