private boolean getMessage(java.lang.String handle, android.bluetooth.client.map.BluetoothMasClient.CharsetType charset, boolean attachments) {
    if (((mProfileService) == null) || (handle == null)) {
        return false;
    }
    android.bluetooth.client.map.BluetoothMasClient cli = mProfileService.getMapClient(mMasInstanceId);
    if (!(cli.getMessage(handle, charset, attachments))) {
        return false;
    }
    goToState(org.codeaurora.bluetooth.bttestapp.MapTestActivity.Job.GET_MESSAGE);
    mPendingGetMessageHandle = handle;
    return true;
}