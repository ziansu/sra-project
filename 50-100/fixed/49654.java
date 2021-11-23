private static android.app.DroidCCManager initDroidCC(android.app.Activity activityCtx) {
    android.app.DroidCCManager dcm = ((android.app.DroidCCManager) (activityCtx.getSystemService("droid_cc")));
    if (dcm == null)
        yzygitzh.droidcc.Utils.showMsg(activityCtx.findViewById(R.id.main_activity_layout), R.string.droidcc_service_fail);
    else
        yzygitzh.droidcc.Utils.showMsg(activityCtx.findViewById(R.id.main_activity_layout), R.string.droidcc_service_success);
    
    return dcm;
}