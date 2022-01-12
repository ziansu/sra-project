@javax.ws.rs.GET
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON })
@javax.ws.rs.Path(value = "/{id}")
public com.emc.storageos.model.dr.SiteRestRep getStandby(@javax.ws.rs.PathParam(value = "id")
java.lang.String id) {
    com.emc.storageos.api.service.impl.resource.DisasterRecoveryService.log.info("Begin to get standby site by uuid");
    java.util.List<java.net.URI> ids = _dbClient.queryByType(com.emc.storageos.db.client.model.Site.class, true);
    java.util.Iterator<com.emc.storageos.db.client.model.Site> sites = _dbClient.queryIterativeObjects(com.emc.storageos.db.client.model.Site.class, ids);
    while (sites.hasNext()) {
        com.emc.storageos.db.client.model.Site standby = sites.next();
        if (standby.getUuid().equals(id)) {
            return siteMapper.map(standby);
        }
    } 
    return null;
}