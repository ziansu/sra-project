public static void setHDAccount(net.bither.bitherj.core.HDAccount hdAccount) {
    if ((net.bither.preference.AppSharedPreference.getInstance().getAppMode()) == (BitherjSettings.AppMode.COLD)) {
        net.bither.util.BackupUtil.backupColdKey(false);
    }else {
        net.bither.bitherj.core.AddressManager.getInstance().setHdAccountHot(hdAccount);
        net.bither.util.BackupUtil.backupHotKey();
    }
}