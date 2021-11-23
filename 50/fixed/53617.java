@java.lang.Override
public void run() {
    if (!(deviceList.contains(device))) {
        deviceList.add(device);
        deviceName.add(device.getName());
        arrayAdapter.notifyDataSetChanged();
    }
}