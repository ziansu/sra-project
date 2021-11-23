public void handleMessage(android.os.Message msg) {
    if ((progress) != null) {
        progress.dismiss();
    }
    if (!(com.fionera.cleaner.utils.DroidWallApi.hasRootAccess(mContext, true))) {
        return ;
    }
    com.fionera.cleaner.utils.DroidWallApi.showIpTablesRules(mContext);
}