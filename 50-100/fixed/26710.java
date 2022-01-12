public synchronized void loadDeviceList(java.util.List<eu.geekgasm.kintrol.DeviceInfo> deviceList) {
    deviceList.clear();
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    java.lang.String deviceJson = preferences.getString(eu.geekgasm.kintrol.DeviceInfoPersistenceHandler.DEVICES_PREF_KEY, null);
    com.google.gson.Gson gson = new com.google.gson.Gson();
    eu.geekgasm.kintrol.DeviceInfo[] deviceArray = gson.fromJson(deviceJson, eu.geekgasm.kintrol.DeviceInfo[].class);
    if (deviceArray != null)
        deviceList.addAll(java.util.Arrays.asList(deviceArray));
    
}