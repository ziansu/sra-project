public void updateIndex() {
    org.elasticsearch.common.settings.Settings settings = org.elasticsearch.common.settings.ImmutableSettings.settingsBuilder().put("number_of_replicas", 5).build();
    org.elasticsearch.action.admin.indices.settings.put.UpdateSettingsResponse updateSettingsResponse = client.admin().indices().prepareUpdateSettings("productindex").setSettings(settings).execute().actionGet();
    com.test.java.search.elasticsearch.TestElasticSearch.LOGGER.info(updateSettingsResponse);
}