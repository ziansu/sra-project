@java.lang.Override
public void onActivityResumed(android.app.Activity activity) {
    if (((org.sil.lcir_offline.utils.GlobalData.sAppInvisible) != (-1)) && (((org.sil.lcir_offline.utils.GlobalData.getTimestamp()) - (org.sil.lcir_offline.utils.GlobalData.sAppInvisible)) > 60)) {
        org.sil.lcir_offline.utils.GlobalData.sAppInvisible = -1;
        org.sil.lcir_offline.utils.GlobalData.logout();
    }
}