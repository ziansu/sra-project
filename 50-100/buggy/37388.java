@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.drive.DriveFolder.DriveFileResult driveFileResult) {
    if (driveFileResult.getStatus().isSuccess()) {
        android.util.Log.i(com.example.newcosts.AsyncTaskSaveDeviceData.TAG, "REFERENCE FILE CREATED");
        android.util.Log.i(com.example.newcosts.AsyncTaskSaveDeviceData.TAG, "BACKUP DATA CREATED");
    }else
        android.util.Log.i(com.example.newcosts.AsyncTaskSaveDeviceData.TAG, "!!ERROR CREATING REFERENCE FILE!!");
    
    android.util.Log.i(com.example.newcosts.AsyncTaskSaveDeviceData.TAG, (("TIME SPENT FOR SAVING DATA: " + ((java.lang.System.currentTimeMillis()) - (startTime))) + " MILLISECONDS"));
    completeSavingDataListener.dataSaved(1);
}