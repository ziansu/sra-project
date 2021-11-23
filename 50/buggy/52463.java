public void updateIndex(org.zenframework.z8.server.base.query.Query query) {
    org.zenframework.z8.server.search.SearchIndex index = getIndex(query);
    updateIndex(index, query);
    index.commit();
}