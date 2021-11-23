@com.facebook.react.bridge.ReactMethod
public void setDeveloperMode(boolean enabled) {
    com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings configSettings = new com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings.Builder().setDeveloperModeEnabled(enabled).build();
    com.google.firebase.remoteconfig.FirebaseRemoteConfig.getInstance().setConfigSettings(configSettings);
}