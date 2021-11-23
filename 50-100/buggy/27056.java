public static void initializeDynamics(java.lang.String gameId, java.lang.String gameSecret) {
    java.lang.String dynamicsApiUrl = ((java.lang.String) (PropellerSDKDynamicData.DYNAMICS_API_URL.value(com.fuelpowered.lib.propeller.PropellerSDK.sActivity)));
    junit.framework.Assert.assertTrue("The Dynamics API server URL is undefined or the format is invalid", com.fuelpowered.lib.propeller.PropellerSDK.isValidUrl(dynamicsApiUrl));
    com.fuelpowered.lib.propeller.PropellerSDK.initializeCore(gameId, gameSecret);
}