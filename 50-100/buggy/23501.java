@java.lang.Override
public void run() {
    if ((mVoicemailNotificationRingtone) != null) {
        com.android.phone.common.util.SettingsUtil.updateRingtoneName(mPhone.getContext(), mRingtoneLookupComplete, RingtoneManager.TYPE_NOTIFICATION, mVoicemailNotificationRingtone.getKey(), com.android.phone.msim.MSimCallFeaturesSubSetting.MSG_UPDATE_VOICEMAIL_RINGTONE_SUMMARY);
    }
    if ((mRingtonePreference) != null) {
        com.android.phone.common.util.SettingsUtil.updateRingtoneName(mPhone.getContext(), mRingtoneLookupComplete, RingtoneManager.TYPE_RINGTONE, mRingtonePreference, com.android.phone.msim.MSimCallFeaturesSubSetting.MSG_UPDATE_RINGTONE_SUMMARY, mPhone.getPhoneId());
    }
}