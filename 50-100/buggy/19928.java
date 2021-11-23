private static boolean isWhisperPushUpdated(android.content.pm.PackageManager pm, android.content.Context context) {
    if (!(com.android.settings.Utils.isPackageInstalled(context, com.android.settings.cyanogenmod.PrivacySettings.WHISPERPUSH_UPDATE))) {
        return false;
    }
    if (com.android.internal.util.exodus.SettingsUtils.isMorphExodus(getActivity().getContentResolver())) {
        removePreference("cmstats");
    }
    int result = pm.checkPermission(android.Manifest.permission.INTERCEPT_SMS, com.android.settings.cyanogenmod.PrivacySettings.WHISPERPUSH_UPDATE);
    if (result == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        return true;
    }else {
        android.util.Log.e(com.android.settings.cyanogenmod.PrivacySettings.TAG, "WhisperPush2 package present, but missing required permission!");
        return false;
    }
}