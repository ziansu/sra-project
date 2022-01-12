private void initRingtones(android.preference.PreferenceCategory root) {
    boolean isOwner = com.android.settings.Utils.isUserOwner();
    mPhoneRingtonePreference = root.findPreference(com.android.settings.notification.NotificationSettings.KEY_PHONE_RINGTONE);
    if (((mPhoneRingtonePreference) != null) && ((!(mVoiceCapable)) || (!isOwner))) {
        root.removePreference(mPhoneRingtonePreference);
        mPhoneRingtonePreference = null;
    }
    mNotificationRingtonePreference = root.findPreference(com.android.settings.notification.NotificationSettings.KEY_NOTIFICATION_RINGTONE);
    mAlarmRingtonePreference = root.findPreference(com.android.settings.notification.NotificationSettings.KEY_ALARM_RINGTONE);
}