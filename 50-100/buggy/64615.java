private void loadPreferences(android.content.SharedPreferences sharedPreferences) {
    mUserAwareDisplayEnabled = sharedPreferences.getBoolean(com.cyanogenmod.settings.device.CMActionsSettings.GESTURE_USER_AWARE_DISPLAY_KEY, false);
    mCameraGestureAction = getIntPreference(sharedPreferences, com.cyanogenmod.settings.device.CMActionsSettings.GESTURE_CAMERA_ACTION_KEY);
    mChopChopAction = getIntPreference(sharedPreferences, com.cyanogenmod.settings.device.CMActionsSettings.GESTURE_CHOP_CHOP_KEY);
    mFeedbackIntensity = getIntPreference(sharedPreferences, com.cyanogenmod.settings.device.CMActionsSettings.GESTURE_FEEDBACK_INTENSITY_KEY);
    mIrWakeUpEnabled = sharedPreferences.getBoolean(com.cyanogenmod.settings.device.CMActionsSettings.GESTURE_IR_WAKEUP_KEY, false);
    mPickUpGestureEnabled = sharedPreferences.getBoolean(com.cyanogenmod.settings.device.CMActionsSettings.GESTURE_PICK_UP_KEY, false);
    mIrSilencerEnabled = sharedPreferences.getBoolean(com.cyanogenmod.settings.device.CMActionsSettings.GESTURE_IR_SILENCER_KEY, false);
}