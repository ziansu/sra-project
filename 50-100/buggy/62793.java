@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    switch (requestCode) {
        case ch.zhaw.bait17.audio_signal_processing_toolbox.ui.MediaListActivity.REQUEST_READ_EXTERNAL_STORAGE :
            {
                if (((grantResults.length) > 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
                    permissionIsGranted = true;
                }else {
                    android.widget.Toast.makeText(this, "You don't have permission to read from external storage.", Toast.LENGTH_SHORT).show();
                }
                return ;
            }
    }
}