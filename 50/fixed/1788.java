@java.lang.Override
protected void onInitAppSettings(org.gearvrf.utility.VrAppSettings appSettings) {
    super.onInitAppSettings(appSettings);
    appSettings.getEyeBufferParms().setMultiSamples(2);
    org.gearvrf.utility.VrAppSettings.setShowDebugLog(true);
}