public static int readKeyboardColor(final android.content.SharedPreferences prefs, final android.content.Context context) {
    return prefs.getInt(rkr.simplekeyboard.inputmethod.latin.settings.Settings.PREF_KEYBOARD_COLOR, rkr.simplekeyboard.inputmethod.latin.settings.Settings.readKeyboardDefaultColor(context));
}