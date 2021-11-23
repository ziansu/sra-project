@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    DisableCameraView(opencvCameraView);
    bluetoothCommunication.CloseConnection();
    if ((bluetoothDeviceControlProcesser) != null) {
        bluetoothDeviceControlProcesser.StopProcess();
    }
}