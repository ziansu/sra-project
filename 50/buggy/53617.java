@java.lang.Override
public void run() {
    deviceList.add(device);
    deviceName.add(device.getName());
    arrayAdapter.notifyDataSetChanged();
}