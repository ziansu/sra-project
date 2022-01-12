@java.lang.Override
public org.openedit.Data loadData(org.openedit.Data inHit) {
    if (inHit instanceof org.entermediadb.asset.Category) {
        return inHit;
    }
    org.entermediadb.elasticsearch.categories.ElasticCategory data = ((org.entermediadb.elasticsearch.categories.ElasticCategory) (createNewData()));
    data.setProperties(inHit.getProperties());
    data.setId(inHit.getId());
    return super.loadData(inHit);
}