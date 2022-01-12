@java.lang.Override
public void run() {
    int resId = (com.android.mms.rcs.RcsUtils.saveRcsMassage(this, rcs_id)) ? R.string.copy_to_sdcard_success : R.string.copy_to_sdcard_fail;
    android.os.Looper.prepare();
    android.widget.Toast.makeText(this, resId, Toast.LENGTH_SHORT).show();
    android.os.Looper.loop();
}