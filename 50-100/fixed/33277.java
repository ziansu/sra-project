@java.lang.Override
public void onBackPressed() {
    com.sdcard.manager.FileManager.getInstance().popBackTrack();
    if ("-1".equals(com.sdcard.manager.FileManager.getInstance().topOfBackTrack())) {
        super.onBackPressed();
        return ;
    }
    checkReadPermissionAndRead(com.sdcard.manager.FileManager.getInstance().topOfBackTrack());
}