public void handleMessage(android.os.Message msg) {
    if (!(com.fionera.cleaner.utils.DroidWallApi.hasRootAccess(mContext, true))) {
        return ;
    }
    com.fionera.cleaner.utils.DroidWallApi.showIpTablesRules(mContext);
    if ((progress) != null) {
        progress.dismiss();
    }
}