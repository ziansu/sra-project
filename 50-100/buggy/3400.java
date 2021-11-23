@java.lang.Override
public void onDestroy() {
    org.md2k.utilities.Report.Log.d(org.md2k.moodsurfing.ActivityMoodSurfingExercises.TAG, "onDestroy()...");
    org.md2k.utilities.Report.Log.d(org.md2k.moodsurfing.ActivityMoodSurfingExercises.TAG, ("onDestroy()... isConnected=" + (dataKitAPI.isConnected())));
    if (dataKitAPI.isConnected())
        dataKitAPI.disconnect();
    
    dataKitAPI.close();
    dataKitAPI = null;
    super.onDestroy();
}