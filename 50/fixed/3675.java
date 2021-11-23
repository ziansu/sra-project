@java.lang.Override
public void onResume() {
    if (com.android.messaging.util.OsUtil.hasStoragePermission()) {
        startMediaPickerDataLoader();
    }
}