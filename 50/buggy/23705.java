private void updateRootAccessOptions() {
    java.lang.String value = android.os.SystemProperties.get(com.android.settings.DevelopmentSettings.ROOT_ACCESS_PROPERTY, "1");
    mRootAccess.setValue(value);
    mRootAccess.setSummary(getResources().getStringArray(R.array.root_access_entries)[java.lang.Integer.valueOf(value)]);
}