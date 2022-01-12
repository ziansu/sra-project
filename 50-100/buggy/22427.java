public static void logout() {
    android.util.Log.d(org.sil.lcir_offline.utils.GlobalData.LOG_TAG, "Logout");
    org.sil.lcir_offline.utils.GlobalData.sCurrentUserJwt = null;
    org.sil.lcir_offline.utils.GlobalData.sCurrentUserId = -1;
    org.sil.lcir_offline.utils.GlobalData.sSensitiveData = new android.util.SparseArray();
    if ((org.sil.lcir_offline.utils.GlobalData.sAppPreferences.getCurrentUserId()) != (-1)) {
        org.sil.lcir_offline.utils.GlobalData.sAppPreferences.setCurrentUserId(0);
    }
    org.sil.lcir_offline.utils.GlobalData.sIsLoggedIn = false;
    if ((org.sil.lcir_offline.utils.GlobalData.mLoggedOutListener) != null) {
        org.sil.lcir_offline.utils.GlobalData.mLoggedOutListener.logout();
        org.sil.lcir_offline.utils.GlobalData.mLoggedOutListener = null;
    }
    org.sil.lcir_offline.utils.GlobalData.saveLog();
}