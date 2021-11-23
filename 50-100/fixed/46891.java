@java.lang.Override
public void onResult(com.google.android.gms.drive.DriveFolder.DriveFileResult result) {
    if (!(result.getStatus().isSuccess())) {
        showMessage("Error while trying to create the file");
        return ;
    }
    com.google.android.gms.drive.DriveId id = result.getDriveFile().getDriveId();
    android.util.Log.d(com.oropallo.assunta.recipes.googleDrive.CreateFileActivity.TAG, (id + ""));
}