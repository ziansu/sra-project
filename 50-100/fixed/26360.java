@java.lang.Override
protected void onClick(android.content.Context context) {
    if (com.frostwire.android.gui.transfers.TransferManager.instance().isBittorrentDisconnected()) {
        showBittorrentDisconnectedDialog();
        return ;
    }
    if (seedingOnlyOnWifiButNoWifi()) {
        showNoWifiInformationDialog();
        return ;
    }else
        if (com.frostwire.android.gui.transfers.TransferManager.instance().isMobileAndDataSavingsOn()) {
            showMobileDataProtectionInformationDialog();
        }
    
    if (!(com.frostwire.android.gui.transfers.TransferManager.instance().isSeedingEnabled())) {
        showSeedingDialog();
    }else {
        seedEm();
        com.frostwire.android.gui.util.UIUtils.showTransfersOnDownloadStart(getContext());
    }
}