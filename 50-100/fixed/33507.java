@javax.annotation.security.PermitAll
@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/{networkId}/namespaceFile/{prefix}")
@javax.ws.rs.Produces(value = "text/plain")
@org.ndexbio.rest.annotations.ApiDoc(value = "Retrieves the archived namespace file if exists. Otherwise 404 will be returned.")
public java.lang.String getBELNamespaceFile(@javax.ws.rs.PathParam(value = "networkId")
final java.lang.String networkId, @javax.ws.rs.PathParam(value = "prefix")
final java.lang.String prefix) throws java.lang.Exception, org.ndexbio.model.exceptions.NdexException, org.ndexbio.model.exceptions.ObjectNotFoundException, org.ndexbio.model.exceptions.UnauthorizedOperationException {
    org.ndexbio.rest.services.NetworkAService.logger.info((("[start: Getting namespace file for " + prefix) + " in network {}]"), networkId);
    if (isSearchable(networkId)) {
        try (org.ndexbio.common.models.dao.orientdb.SingleNetworkDAO dao = new org.ndexbio.common.models.dao.orientdb.SingleNetworkDAO(networkId)) {
            java.lang.String s = dao.getNamespaceFile(prefix);
            org.ndexbio.rest.services.NetworkAService.logger.info("[end: Return namespace file of {} ,in network {}]", prefix, networkId);
            return s;
        }
    }else
        throw new org.ndexbio.model.exceptions.UnauthorizedOperationException("User doesn't have read access to this network.");
    
}