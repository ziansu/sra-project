public void rebuildIndex(java.lang.String indexId) {
    org.zenframework.z8.server.search.SearchIndex index = getIndex(indexId);
    java.util.Collection<org.zenframework.z8.server.base.table.Table> tables = org.zenframework.z8.server.search.SearchEngine.CLASS.asList(java.lang.Runtime.instance().tables());
    index.clearIndex();
    for (org.zenframework.z8.server.base.table.Table table : tables) {
        updateIndex(index, table);
    }
    index.commit();
}