public org.gephi.scripting.wrappers.GySubGraph filter(org.gephi.scripting.wrappers.GyFilter filter) {
    org.gephi.filters.api.FilterController filterController = org.openide.util.Lookup.getDefault().lookup(org.gephi.filters.api.FilterController.class);
    org.gephi.filters.api.Query query;
    if ((constructionQuery) != null) {
        query = filterController.createQuery(((org.gephi.filters.spi.FilterBuilder) (filter.getUnderlyingQuery().getFilter())));
        filterController.setSubQuery(query, constructionQuery);
    }else {
        query = filter.getUnderlyingQuery();
    }
    return new org.gephi.scripting.wrappers.GySubGraph(namespace, query);
}