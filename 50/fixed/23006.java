@java.lang.Override
public void onError(java.lang.String message) {
    android.util.Log.e(net.nitroshare.android.transfer.TransferService.TAG, java.lang.String.format("transfer %d failed: %s", transferId, message));
    showErrorNotification(transferId, device, message);
}