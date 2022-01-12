public static void setHDAccount(net.bither.bitherj.core.HDAccount hdAccount) {
    net.bither.bitherj.core.AddressManager.getInstance().setHdAccountHot(hdAccount);
    if ((net.bither.preference.AppSharedPreference.getInstance().getAppMode()) == (BitherjSettings.AppMode.COLD)) {
        net.bither.util.BackupUtil.backupColdKey(false);
    }else {
        net.bither.util.BackupUtil.backupHotKey();
    }
}