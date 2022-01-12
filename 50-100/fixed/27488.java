public void requestContacts(java.util.Collection<android.net.wifi.p2p.WifiP2pDevice> deviceList) {
    java.util.ArrayList<java.lang.String> macList = new java.util.ArrayList<java.lang.String>();
    for (android.net.wifi.p2p.WifiP2pDevice device : deviceList) {
        macList.add(device.deviceAddress);
    }
    com.textapp.Transmittable.ContactRequest request = new com.textapp.Transmittable.ContactRequest(macAddress, macList);
    new com.textapp.MessageTask(Constants.PORT_IN, groupOwnerAddress).executeOnExecutor(MessageTask.SERIAL_EXECUTOR, request);
}