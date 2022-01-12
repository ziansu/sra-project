@java.lang.Override
public void onBackPressed() {
    if ("-1".equals(com.sdcard.manager.FileManager.getInstance().topOfBackTrack())) {
        super.onBackPressed();
    }
    com.sdcard.manager.FileManager.getInstance().popBackTrack();
    checkReadPermissionAndRead(com.sdcard.manager.FileManager.getInstance().topOfBackTrack());
}