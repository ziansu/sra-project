@java.lang.Override
public void onResponse(java.lang.String dataSourceType, java.lang.String response) {
    if (response != null) {
        phoneSensorDataSources.find(dataSourceType).setFrequency(response);
        updatePreferenceScreen();
    }
}