@java.lang.Override
public void onDestroy() {
    org.md2k.utilities.Report.Log.d(org.md2k.phonesensor.ServicePhoneSensor.TAG, ((("onDestroy()...phoneSensorDataSources=" + (phoneSensorDataSources)) + " isRunning=") + (dataKitHandler.isConnected())));
    if ((phoneSensorDataSources) != null) {
        phoneSensorDataSources.unregister();
        phoneSensorDataSources = null;
    }
    if (Constants.TEST_BATTERY)
        org.md2k.phonesensor.BCMRecord.getInstance().close();
    
    if (dataKitHandler.isConnected())
        dataKitHandler.disconnect();
    
    dataKitHandler.close();
    super.onDestroy();
}