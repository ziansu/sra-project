@java.lang.Override
public void onSuccess(java.lang.String response) {
    com.google.gson.Gson g = new com.google.gson.GsonBuilder().registerTypeAdapter(org.apereo.models.Config.class, new org.apereo.deserializers.ConfigDeserializer()).create();
    org.apereo.models.Config config = g.fromJson(response, org.apereo.models.Config.class);
    configManager.setConfig(config);
    getAccountFeed();
    if (config.isUpgradeRequired()) {
        showErrorDialog(AppConstants.UPGRADE_REQUIRED);
    }else
        if (config.isUpgradeRecommended()) {
            showErrorDialog(AppConstants.UPGRADE_RECOMMENDED);
        }
    
}