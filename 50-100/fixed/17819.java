public DeviceManagement.Device RegisterDevice(java.lang.String name, java.lang.String IP, int PORT, java.lang.String MAC, java.lang.String AUTH) {
    DeviceManagement.Device d = GetDevice(name);
    if (d == null) {
        d = new DeviceManagement.Device(name, IP, PORT, MAC, AUTH);
        mDevices.add(d);
    }
    d.IP = IP;
    d.PORT = PORT;
    d.MAC = MAC;
    d.AUTH = AUTH;
    return d;
}