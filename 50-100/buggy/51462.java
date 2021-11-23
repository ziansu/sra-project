private void loadPreferences(android.content.SharedPreferences sharedPreferences) {
    mCameraGestureEnabled = sharedPreferences.getBoolean(com.gestures.settings.device.ActionsSettings.GESTURE_CAMERA_ACTION_KEY, true);
    mChopChopEnabled = sharedPreferences.getBoolean(com.gestures.settings.device.ActionsSettings.GESTURE_CHOP_CHOP_KEY, true);
    mIrWakeUpEnabled = sharedPreferences.getBoolean(com.gestures.settings.device.ActionsSettings.GESTURE_IR_WAKEUP_KEY, true);
    mPickUpGestureEnabled = sharedPreferences.getBoolean(com.gestures.settings.device.ActionsSettings.GESTURE_PICK_UP_KEY, true);
    mIrSilencerEnabled = sharedPreferences.getBoolean(com.gestures.settings.device.ActionsSettings.GESTURE_IR_SILENCER_KEY, false);
    mFlipToMuteEnabled = sharedPreferences.getBoolean(com.gestures.settings.device.ActionsSettings.GESTURE_FLIP_TO_MUTE_KEY, false);
    mLiftToSilenceEnabled = sharedPreferences.getBoolean(com.gestures.settings.device.ActionsSettings.GESTURE_LIFT_TO_SILENCE_KEY, false);
}