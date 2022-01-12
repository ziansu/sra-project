@org.androidannotations.annotations.AfterInject
protected void init() {
    targetConfig = com.orange.datashare.client.ServerConfig.valueOf(prefs.targetDSInstance().get());
    timber.log.Timber.d("Initializing DatashareClient for server %s", targetConfig.baseUrl());
    client = com.orange.datashare.client.DatashareClient.builder().baseUrl(targetConfig.baseUrl()).logLevel(com.orange.datashare.demo.helper.DatashareHelper.LOG_LEVEL).clientId(clientId).clientSecret(clientSecret).build();
}