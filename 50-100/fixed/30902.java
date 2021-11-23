@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle args = getArguments();
    allDevices = ((java.util.ArrayList<android.bluetooth.BluetoothDevice>) (args.get(edu.kit.teco.radarbeacon.SelectDeviceDialog.DIALOG_EXTRA_DEVICES)));
    selectedDevices = new java.util.ArrayList<>();
}