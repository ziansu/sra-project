public void initOrchextra() {
    com.gigigo.orchextra.OrchextraBuilder builder = new com.gigigo.orchextra.OrchextraBuilder(this).setApiKeyAndSecret(gigigo.com.orchextrasdk.App.API_KEY, gigigo.com.orchextrasdk.App.API_SECRET).setLogLevel(OrchextraLogLevel.NETWORK).setOrchextraCompletionCallback(this).setImageRecognitionModule(new com.gigigo.vuforiaimplementation.ImageRecognitionVuforiaImpl());
    com.gigigo.orchextra.Orchextra.initialize(builder);
    com.gigigo.orchextra.Orchextra.setCustomSchemeReceiver(this);
    com.gigigo.orchextra.Orchextra.setCredentialCallback(gigigo.com.orchextrasdk.App.mOrchextraCredentialCallback);
    com.gigigo.orchextra.Orchextra.updateBackgroundPeriodBetweenScan(BeaconBackgroundPeriodBetweenScan.EXTREME);
    com.gigigo.orchextra.Orchextra.start();
}