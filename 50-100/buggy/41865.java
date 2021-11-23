public int getDeviceRingerMode() {
    int ringerMode = github.nisrulz.easydeviceinfo.EasyDeviceInfo.RINGER_MODE_NORMAL;
    android.media.AudioManager audioManager = ((android.media.AudioManager) (context.getSystemService(Context.AUDIO_SERVICE)));
    switch (audioManager.getRingerMode()) {
        case android.media.AudioManager.RINGER_MODE_NORMAL :
            ringerMode = github.nisrulz.easydeviceinfo.EasyDeviceInfo.RINGER_MODE_NORMAL;
            break;
        case android.media.AudioManager.RINGER_MODE_SILENT :
            ringerMode = github.nisrulz.easydeviceinfo.EasyDeviceInfo.RINGER_MODE_SILENT;
            break;
        case android.media.AudioManager.RINGER_MODE_VIBRATE :
            ringerMode = github.nisrulz.easydeviceinfo.EasyDeviceInfo.RINGER_MODE_VIBRATE;
    }
    return ringerMode;
}