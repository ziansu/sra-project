@java.lang.Override
public void onError(final android.bluetooth.BluetoothDevice device, final java.lang.String message, final int errorCode) {
    final android.content.Intent broadcast = new android.content.Intent(no.nordicsemi.android.nrftoolbox.profile.multiconnect.BleMulticonnectProfileService.BROADCAST_ERROR);
    broadcast.putExtra(no.nordicsemi.android.nrftoolbox.profile.multiconnect.BleMulticonnectProfileService.EXTRA_DEVICE, device);
    broadcast.putExtra(no.nordicsemi.android.nrftoolbox.profile.multiconnect.BleMulticonnectProfileService.EXTRA_ERROR_MESSAGE, message);
    broadcast.putExtra(no.nordicsemi.android.nrftoolbox.profile.multiconnect.BleMulticonnectProfileService.EXTRA_ERROR_CODE, errorCode);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(broadcast);
}