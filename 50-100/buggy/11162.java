@java.lang.Override
public void onStart() {
    super.onStart();
    final android.content.Context context = getApplicationContext();
    if ((org.droidplanner.android.BuildConfig.DEBUG) || ((org.droidplanner.android.utils.Utils.getAppVersionCode(context)) > (mAppPrefs.getSavedAppVersionCode()))) {
        org.droidplanner.android.dialogs.DialogMaterialFragment changelog = new org.droidplanner.android.dialogs.DialogMaterialFragment();
        changelog.show(getSupportFragmentManager(), "Changelog Dialog");
        mAppPrefs.updateSavedAppVersionCode(context);
    }
}