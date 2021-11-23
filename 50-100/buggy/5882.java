@java.lang.Override
public void run() {
    int resId = R.string.copy_to_sdcard_fail;
    if (rcs_id != 0) {
        resId = (com.android.mms.rcs.RcsUtils.saveRcsMassage(this, rcs_id)) ? R.string.copy_to_sdcard_success : R.string.copy_to_sdcard_fail;
    }
    android.os.Looper.prepare();
    android.widget.Toast.makeText(this, resId, Toast.LENGTH_SHORT).show();
    android.os.Looper.loop();
}