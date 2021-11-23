private void setUsesDetails(org.eclipse.birt.data.engine.api.querydefn.BaseQueryDefinition baseQuery) {
    if ((baseQuery instanceof org.eclipse.birt.data.engine.api.querydefn.QueryDefinition) && (!(baseQuery.cacheQueryResults()))) {
        ((org.eclipse.birt.data.engine.api.querydefn.QueryDefinition) (baseQuery)).setIsSummaryQuery(true);
    }
    if ((baseQuery != null) && (!(baseQuery.cacheQueryResults()))) {
        baseQuery.setUsesDetails(false);
    }
}