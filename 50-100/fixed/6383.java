private void initCleverTap() {
    try {
        com.clevertap.android.sdk.CleverTapAPI.setDebugLevel(1);
        clevertap = com.clevertap.android.sdk.CleverTapAPI.getInstance(getApplicationContext());
        clevertap.enablePersonalization();
        clevertap.setSyncListener(this);
    } catch (com.clevertap.android.sdk.exceptions.CleverTapMetaDataNotFoundException | com.clevertap.android.sdk.exceptions.CleverTapPermissionsNotSatisfied e) {
        e.printStackTrace();
    }
}