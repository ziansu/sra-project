@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (intent.getAction().equals(com.jianghongkui.volumemanager.other.VolumeChangeService.ACTION_ACTIVITY_CHANGED)) {
        currentActivityPackageName = intent.getStringExtra("PackageName");
        com.jianghongkui.volumemanager.util.MLog.d(com.jianghongkui.volumemanager.other.VolumeChangeService.TAG, ("currentActivityPackageName-" + (currentActivityPackageName)));
        if ((!(Settings.list.contains(currentActivityPackageName))) && (!(currentActivityPackageName.equals(lastActivityPackageName)))) {
            maybeChangeVolume(currentActivityPackageName);
            lastActivityPackageName = currentActivityPackageName;
        }
    }
}