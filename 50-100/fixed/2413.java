@java.lang.Override
public void onDestroy() {
    if ((phoneSensorDataSources) != null) {
        phoneSensorDataSources.unregister();
        phoneSensorDataSources = null;
    }
    if (Constants.TEST_BATTERY)
        org.md2k.phonesensor.BCMRecord.getInstance().close();
    
    if (((dataKitHandler) != null) && (dataKitHandler.isConnected()))
        dataKitHandler.disconnect();
    
    if ((dataKitHandler) != null)
        dataKitHandler.close();
    
    super.onDestroy();
}