@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle arguments = getArguments();
    if (arguments != null) {
        mInitialDash = arguments.getFloatArray(eu.geopaparazzi.library.core.dialogs.StrokeDashDialogFragment.PREFS_KEY_STROKEDASH);
        if ((mInitialDash) != null) {
            mCurrentDash = mInitialDash;
        }
        mDashShift = arguments.getFloat(eu.geopaparazzi.library.core.dialogs.StrokeDashDialogFragment.PREFS_KEY_STROKEDASHSHIFT);
    }
}