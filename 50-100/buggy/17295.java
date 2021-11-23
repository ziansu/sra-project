@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    final java.lang.String key = preference.getKey();
    if (com.cyanogenmod.settings.device.TouchscreenGestureSettings.KEY_HAPTIC_FEEDBACK.equals(key)) {
        final boolean value = ((java.lang.Boolean) (newValue));
        Settings.System.putInt(getContentResolver(), Settings.System.TOUCHSCREEN_GESTURE_HAPTIC_FEEDBACK, (value ? 1 : 0));
        return true;
    }
    return false;
}