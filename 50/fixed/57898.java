@java.lang.Override
public void onNewTransfer(net.nitroshare.android.transfer.Transfer transfer) {
    transfer.setId(mTransferNotificationManager.nextId());
    mTransferManager.addTransfer(transfer, null);
}