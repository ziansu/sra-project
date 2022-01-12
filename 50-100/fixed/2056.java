@java.lang.Override
public com.sitewhere.spi.device.ISite createSite(com.sitewhere.spi.device.request.ISiteCreateRequest request) throws com.sitewhere.spi.SiteWhereException {
    com.sitewhere.rest.model.device.Site site = com.sitewhere.core.SiteWherePersistence.siteCreateLogic(request);
    com.mongodb.DBCollection sites = getMongoClient().getSitesCollection();
    com.mongodb.DBObject created = com.sitewhere.mongodb.device.MongoSite.toDBObject(site);
    com.sitewhere.mongodb.MongoPersistence.insert(sites, created);
    return com.sitewhere.mongodb.device.MongoSite.fromDBObject(created);
}