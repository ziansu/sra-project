static void stopTransfer(int transferId) {
    net.nitroshare.android.transfer.TransferWrapper transferWrapper = net.nitroshare.android.transfer.TransferWrapper.sActiveTransfers.get(transferId);
    if (transferWrapper != null) {
        transferWrapper.mTransfer.stop();
    }
}