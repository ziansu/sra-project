@java.lang.Override
public void onServiceDisconnected(final android.content.ComponentName name) {
    com.ape.transfer.util.Log.i(com.ape.transfer.activity.ApScanActivity.TAG, "onServiceDisconnected");
    mTransferService = null;
}