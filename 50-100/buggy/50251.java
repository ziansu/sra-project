@javax.ws.rs.POST
@javax.annotation.security.PermitAll
@javax.ws.rs.Path(value = "/search/{skipBlocks}/{blockSize}")
@javax.ws.rs.Produces(value = "application/json")
@org.ndexbio.rest.annotations.ApiDoc(value = "Returns a list of groups found based on the searchOperator and the POSTed searchParameters.")
public org.ndexbio.model.object.SolrSearchResult<org.ndexbio.model.object.Group> findGroups(org.ndexbio.model.object.SimpleQuery simpleQuery, @javax.ws.rs.PathParam(value = "skipBlocks")
final int skip, @javax.ws.rs.PathParam(value = "blockSize")
final int top) throws java.io.IOException, java.lang.IllegalArgumentException, java.sql.SQLException, org.apache.solr.client.solrj.SolrServerException, org.ndexbio.model.exceptions.NdexException {
    org.ndexbio.rest.services.GroupService.logger.info("[start: Search group \"{}\"]", simpleQuery.getSearchString());
    try (org.ndexbio.common.models.dao.postgresql.GroupDAO dao = new org.ndexbio.common.models.dao.postgresql.GroupDAO()) {
        final org.ndexbio.model.object.SolrSearchResult<org.ndexbio.model.object.Group> groups = dao.findGroups(simpleQuery, skip, top);
        org.ndexbio.rest.services.GroupService.logger.info("[end: Search group \"{}\"]", simpleQuery.getSearchString());
        return groups;
    }
}