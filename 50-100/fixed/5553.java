private static java.lang.String getSettingForType(int type) {
    if ((type & (android.media.RingtoneManager.TYPE_RINGTONE)) != 0) {
        return android.provider.Settings.System.RINGTONE;
    }else
        if ((type & (android.media.RingtoneManager.TYPE_NOTIFICATION)) != 0) {
            return android.provider.Settings.System.NOTIFICATION_SOUND;
        }else
            if ((type & (android.media.RingtoneManager.TYPE_ALARM)) != 0) {
                return android.provider.Settings.System.ALARM_ALERT;
            }else {
                return null;
            }
        
    
}