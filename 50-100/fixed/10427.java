public void handleMessage(android.os.Message msg) {
    if (!(com.fionera.cleaner.utils.DroidWallApi.hasRootAccess(mContext, true))) {
        return ;
    }
    if (com.fionera.cleaner.utils.DroidWallApi.applyIpTablesRules(mContext, true)) {
        com.fionera.cleaner.utils.ShowToast.show("规则已应用");
    }
    if ((progress) != null) {
        progress.dismiss();
    }
}