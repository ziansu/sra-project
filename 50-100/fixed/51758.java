public void onQueryChange(org.sagebionetworks.repo.model.table.Query newQuery) {
    if (newQuery != null) {
        java.lang.String token = queryTokenProvider.queryToToken(newQuery);
        if (token != null) {
            areaToken = (org.sagebionetworks.web.client.widget.entity.tabs.TablesTab.TABLE_QUERY_PREFIX) + token;
            tab.setEntityNameAndPlace(entity.getName(), new org.sagebionetworks.web.client.place.Synapse(entity.getId(), null, org.sagebionetworks.web.client.place.Synapse.EntityArea.TABLES, areaToken));
            tab.showTab(false);
        }
    }
}