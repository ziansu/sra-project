@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.CaptureRawwithoutJpeg :
            com.yorku.mstew.camera2videoimage.SettingsActivity.CaptureRawwithJPEGBoolean = true;
            com.yorku.mstew.camera2videoimage.SettingsActivity.CaptureRawwithoutJPEGBoolean = false;
            break;
    }
    return true;
}