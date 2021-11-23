@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference ss, java.lang.Object val) {
    java.lang.Boolean disable = ((java.lang.Boolean) (val));
    if (disable.booleanValue()) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
    }else {
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_SECURE);
    }
    return false;
}