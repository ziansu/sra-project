@java.lang.Override
public void run() {
    isToDisplayLogin = false;
    skipVerification = true;
    if (nu.yona.app.YonaApplication.getEventChangeManager().getSharedPreference().getUserPreferences().getString(PreferenceConstant.PROFILE_UUID, "").equals("")) {
        checkFileWritePermission();
    }else {
        isUserFromOnCreate = true;
        android.util.Log.e("Start VPN", "Start VPN");
        nu.yona.app.utils.AppUtils.startVPN(this);
    }
}