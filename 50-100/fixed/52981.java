@java.lang.Override
public void run() {
    dismissProgressDialog();
    if (device == null) {
        if ((mConnectingDevice) != null) {
            org.deviceconnect.android.deviceplugin.hitoe.data.HitoeDevice container = findDeviceContainerByAddress(mConnectingDevice.getId());
            if (container != null) {
                container.setPinCode(null);
                mDeviceAdapter.notifyDataSetChanged();
            }
            android.content.res.Resources res = getResources();
            showErrorDialog(res.getString(R.string.hitoe_setting_dialog_error_message03));
        }
    }else {
        showErrorDialogNotConnect(device.getName());
    }
}