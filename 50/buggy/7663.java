@java.lang.Override
public void onSuccess() {
    android.util.Log.i(net.nitroshare.android.transfer.TransferService.TAG, java.lang.String.format("transfer %d succeeded", transferId));
    showSuccessNotification(transferId, device);
}