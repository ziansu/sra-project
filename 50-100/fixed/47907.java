void handleAfterRecoverWallet() {
    appDelegate.updateGodSend(TLWalletUtils.TLSendFromType.HDWallet, 0);
    appDelegate.updateReceiveSelectedObject(TLWalletUtils.TLSendFromType.HDWallet, 0);
    appDelegate.updateHistorySelectedObject(TLWalletUtils.TLSendFromType.HDWallet, 0);
    appDelegate.saveWalletJson();
    android.support.v4.content.LocalBroadcastManager.getInstance(appDelegate.context).sendBroadcast(new android.content.Intent(com.arcbit.arcbit.model.TLNotificationEvents.EVENT_RESTORE_WALLET));
}