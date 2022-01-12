public void deleteAll(org.openedit.users.User inUser) {
    org.entermediadb.elasticsearch.searchers.BaseElasticSearcher.log.info(("Deleted all records database " + (getSearchType())));
    for (java.util.Iterator iterator = getAllHits().iterator(); iterator.hasNext();) {
        org.openedit.Data row = ((org.openedit.Data) (iterator.next()));
        delete(row, null);
    }
}